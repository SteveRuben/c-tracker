package inc.akap.ctracker_cli.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MenuItem;

import butterknife.BindView;
import inc.akap.ctracker_cli.R;
import inc.akap.ctracker_cli.base.BaseActivity;
import inc.akap.ctracker_cli.fragment.DashboardFragment;
import inc.akap.ctracker_cli.fragment.HomeFragment;
import inc.akap.ctracker_cli.fragment.ProfileFragment;
import inc.akap.ctracker_cli.other.ViewPagerAdapter;

public class MainActivity extends BaseActivity {

    @BindView(R.id.viewpager)  ViewPager viewPager;
    MenuItem prevMenuItem;
    @BindView(R.id.navigation)  BottomNavigationView navigation;
    HomeFragment homeFragment;
    DashboardFragment dashboardFragment;
    ProfileFragment profileFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void init(Bundle savedInstanceStae) {
        super.init(savedInstanceStae);
    }

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        setupViewPager(viewPager);
    }

    @Override
    public void initListener() {
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                } else  {
                    navigation.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page", "onPageSelected: "+position);
                navigation.getMenu().getItem(position).setChecked(true);
                prevMenuItem = navigation.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }

        });
    }

    @Override
    public void initData() {

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        homeFragment= HomeFragment.newInstance();
        dashboardFragment= DashboardFragment.newInstance();
        profileFragment= ProfileFragment.newInstance();
        adapter.addFragment(homeFragment);
        adapter.addFragment(dashboardFragment);
        adapter.addFragment(profileFragment);
        viewPager.setAdapter(adapter);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_notifications:
                    viewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }

    };
}
