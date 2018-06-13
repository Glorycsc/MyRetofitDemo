package com.example.javatest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.jaeger.library.StatusBarUtil;

/**
 * Created by Glory on 2018/5/8.
 */

public class FullScreenActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
//        StatusBarUtil.setTranslucent(this,99);
        ImageView i = new ImageView(this);
        i.setImageResource(R.mipmap.fullbg);
        StatusBarUtil.setTranslucentForImageView(this,33,i);
    }
}
