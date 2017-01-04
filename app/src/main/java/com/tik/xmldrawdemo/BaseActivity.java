package com.tik.xmldrawdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void beforeBindViews();

    protected abstract void afterBindViews();

    protected abstract int getLayoutId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        beforeBindViews();
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        afterBindViews();
    }

    protected void toActivity(Class<?> cls){
        startActivity(new Intent(getApplicationContext(), cls));
    }
}
