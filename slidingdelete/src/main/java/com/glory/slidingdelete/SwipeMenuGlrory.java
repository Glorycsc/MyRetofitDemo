package com.glory.slidingdelete;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Create by glorizz on 2018/8/8
 * Describe:
 */
public class SwipeMenuGlrory extends ViewGroup {
    //将三个构造方法都指向参数最多的那个
    public SwipeMenuGlrory(Context context) {
        this(context, null);
    }

    public SwipeMenuGlrory(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SwipeMenuGlrory(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //必须重写的唯一方法
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {

    }
}
