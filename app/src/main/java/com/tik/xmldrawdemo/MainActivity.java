package com.tik.xmldrawdemo;


import android.view.View;


import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @OnClick({R.id.shape, R.id.selector,R.id.layerlist, R.id.animation})
    void onClick(View view){
        switch (view.getId()){
            case R.id.shape:
                toActivity(ShapeActivity.class);
                break;
            case R.id.selector:
                toActivity(SelectorActivity.class);
                break;
            case R.id.layerlist:
                toActivity(LayerListActivity.class);
                break;
            case R.id.animation:
                toActivity(AnimationActivity.class);
                break;
        }
    }


    @Override
    protected void beforeBindViews() {

    }

    @Override
    protected void afterBindViews() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

}
