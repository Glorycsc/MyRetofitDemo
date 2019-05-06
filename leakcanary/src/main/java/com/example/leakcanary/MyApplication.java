package com.example.leakcanary;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Create by glorizz on 2018/6/19
 * Describe:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
