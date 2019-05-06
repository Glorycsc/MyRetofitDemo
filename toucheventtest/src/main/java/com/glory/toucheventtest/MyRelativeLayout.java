package com.glory.toucheventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Create by glorizz on 2018/8/14
 * Describe:
 */
public class MyRelativeLayout extends RelativeLayout {
    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("gg","viewGroup----dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("gg","viewGroup----onInterceptTouchEvent");
//        return super.onInterceptTouchEvent(ev);
        return  true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("gg","viewGroup----onTouchEvent");
//        return super.onTouchEvent(event);
        return  true;
    }
}
