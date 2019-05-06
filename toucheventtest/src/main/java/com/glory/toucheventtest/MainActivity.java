package com.glory.toucheventtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("gg", "activity----dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
//        return  false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("gg", "activity----onTouchEvent");
        return super.onTouchEvent(event);
//        return true;
    }

}
