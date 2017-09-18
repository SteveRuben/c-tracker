package inc.akap.ctracker_cli.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.airbnb.lottie.LottieAnimationView;

import butterknife.BindView;
import inc.akap.ctracker_cli.R;
import inc.akap.ctracker_cli.base.BaseActivity;
import inc.akap.ctracker_cli.widget.TimerTextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashActivity extends BaseActivity {
    @BindView(R.id.tv_count_down)TimerTextView mTvCountDown;
    @BindView(R.id.lottie_view)
    LottieAnimationView mLottieView;
    @BindView(R.id.fonts)
    LinearLayout mFontsLayout;
    @Override
    public int setLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        mTvCountDown.setTimes(5);
        mTvCountDown.beginRun();
    }

    @Override
    public void initListener() {
        mTvCountDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mTvCountDown.isRun()){
                    startActivity(new Intent(view.getContext(), LoginActivity.class));
                    finish();
                }
            }
        });
    }

    @Override
    public void initData() {

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
