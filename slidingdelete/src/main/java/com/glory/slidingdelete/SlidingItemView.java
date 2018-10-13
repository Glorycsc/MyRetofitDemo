package com.glory.slidingdelete;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/**
 * Create by glorizz on 2018/8/4
 * Describe:
 */
public class SlidingItemView extends ViewGroup {
    public SlidingItemView(Context context) {
        super(context);
    }

    public SlidingItemView(Context context, AttributeSet attrs) {
        //加载布局
        super(context, attrs);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.sliding_item_view_layout, this);//将这个布局与这个ViewGroup绑定
    }

    //onlayout是必须重写的
    //由于viewgroup的onLayout方法是抽象的,所以必须重写,并且不能super.onLayout(b, i, i1, i2, i3)交给ViewGroup去处理
    //返回值是void的---多有的布局操作,在本方法中完成
    //gravity失效
    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
        Log.e("layout----", this.getChildCount() + "");
        Log.e("layout----", (this.getChildAt(0) instanceof LinearLayout) + "");//false
        Log.e("layout----", (this.getChildAt(0) instanceof HorizontalScrollView) + "");//true

        layoutEveryone(this, i, i1, i2, i3);

    }

    private void layoutEveryone(ViewGroup vp, int i, int i1, int i2, int i3) {
        for (int k = 0; k < vp.getChildCount(); k++) {
            View childView = vp.getChildAt(k);
            if (childView instanceof ViewGroup) {
                layoutEveryone((ViewGroup) childView, i, i1, i2, i3);
            }
            childView.layout(i, i1, i2, i3);
        }
    }

    //滑动事件的处理------------------------主要处理左右滑动事件---------------------------------------------------------
    private int left, right, top, bottom;
    private float oldX, oldY;
    private float x, y;

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //getX()当前的x值---按下的是初始的值
                oldX = getX();
                oldY = getY();
                break;
            case MotionEvent.ACTION_MOVE:
                x = getX();
                y = getY();
                //滑动时的跟随,scrollview已经做了
                break;
            case MotionEvent.ACTION_UP:
                //计算是左滑还是右滑
                break;
        }

        return super.dispatchTouchEvent(ev);
    }
}
