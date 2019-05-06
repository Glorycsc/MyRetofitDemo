package com.glory.adapterviewinscrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ListView;

/**
 * Create by glorizz on 2018/8/2
 * Describe:重写onMeasure方法,验证测量类型
 */
public class MyListView extends ListView {
    //构造方法

    public MyListView(Context context) {
        super(context);
    }

    //如果只是在xml文件中用到,那只用这一个就可以了
    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ViewParent parent = this.getParent();
        if (parent instanceof LinearLayout)
            Log.e("glz", "height----" + Integer.toBinaryString(heightMeasureSpec) + (parent instanceof LinearLayout));
//        int height = MeasureSpec.makeMeasureSpec(heightMeasureSpec, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
