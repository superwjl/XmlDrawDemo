package com.tik.xmldrawdemo;


import android.view.View;

import com.tik.xmldrawdemo.shape.LineAct;
import com.tik.xmldrawdemo.shape.OvalAct;
import com.tik.xmldrawdemo.shape.RectAct;
import com.tik.xmldrawdemo.shape.RingAct;

import butterknife.OnClick;

public class ShapeActivity extends BaseActivity {

    @OnClick({R.id.shape_line, R.id.shape_rect, R.id.shape_oval, R.id.shape_ring})
    void onClick(View view){
        switch (view.getId()){
            case R.id.shape_line:
                toActivity(LineAct.class);
                break;
            case R.id.shape_rect:
                toActivity(RectAct.class);
                break;
            case R.id.shape_oval:
                toActivity(OvalAct.class);
                break;
            case R.id.shape_ring:
                toActivity(RingAct.class);
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
        return R.layout.activity_shape;
    }

}
