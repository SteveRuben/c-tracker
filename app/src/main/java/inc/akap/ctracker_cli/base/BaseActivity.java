package inc.akap.ctracker_cli.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        init(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        ButterKnife.bind(this);
        initView(savedInstanceState);
        initListener();
        initData();
    }

    public void init(Bundle savedInstanceStae) {
    }

    public abstract int setLayoutId();

    public abstract void initView(Bundle savedInstanceState);

    public void initListener() {
    }

    public abstract void initData();
}

