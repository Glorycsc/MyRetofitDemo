package com.glory.adapterviewinscrollview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * Create by glorizz on 2018/8/2
 * Describe:
 */
public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.e("glz", "LLLLLLLLLLLLLLLL----------" + Integer.toBinaryString(heightMeasureSpec));
        int i = MeasureSpec.makeMeasureSpec(heightMeasureSpec, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, i);//传给父类我自身测量完成的值(自身测量完成把值传给父类)
    }
}
