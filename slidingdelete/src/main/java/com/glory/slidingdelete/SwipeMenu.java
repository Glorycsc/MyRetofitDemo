package com.glory.slidingdelete;

/**
 * Create by glorizz on 2018/8/4
 * Describe:来自简书  存在bug(呼出菜单没问题,隐藏的时候的触发有问题)
 */

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/6/27.
 * 直接继承自viewgroup-=----不用绑定布局了,用layout来控制自身内部的布局
 */

public class SwipeMenu extends ViewGroup {

    private Context context;
    private int downX, moveX, moved;
    private Scroller scroller = new Scroller(getContext());
    private boolean haveShowRight = false;
    public static SwipeMenu swipeMenu;

    private LeftClickListener listener;

    public SwipeMenu(Context context) {
        super(context);
        this.context = context;

    }

    public SwipeMenu(Context context, AttributeSet attrs) {

        super(context, attrs);
        this.context = context;
    }

    //继承自viewGroup的不用绑定布局
    public SwipeMenu(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }


    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (swipeMenu != null && swipeMenu == this) {
            swipeMenu.closeMenus();
            swipeMenu = null;
        }
    }

    //缓慢滚动到指定位置
    private void smoothScrollTo(int destX, int destY) {
        int scrollX = getScrollX();
        int delta = destX - scrollX;
        //1000ms内滑动destX，效果就是慢慢滑动
        scroller.startScroll(scrollX, 0, delta, 0, 100);
        invalidate();
    }

    public void closeMenus() {
        smoothScrollTo(0, 0);
        haveShowRight = false;
    }

    public static void closeMenu() {
        swipeMenu.closeMenus();
    }

    @Override
    public void computeScroll() {
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
    }

    boolean isSwip = false;

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (!scroller.isFinished()) {
            return false;
        }
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downX = (int) ev.getRawX();
                break;
            case MotionEvent.ACTION_MOVE:
                isSwip = true;
                //移动的时候的跟随动作
                if (swipeMenu != null && swipeMenu == this && haveShowRight) {
                    //判断滑动的距离
                    if (ev.getRawX() - downX > 10) {
                        closeMenu();
                        return true;
                    }
                }
                moveX = (int) ev.getRawX();

                moved = moveX - downX;

                if (haveShowRight) {
                    moved -= getChildAt(1).getMeasuredWidth();
                }
                scrollTo(-moved, 0);
                if (getScrollX() <= 0) {
                    scrollTo(0, 0);
                } else if (getScrollX() >= getChildAt(1).getMeasuredWidth()) {
                    scrollTo(getChildAt(1).getMeasuredWidth(), 0);
                }
                break;
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                if (!isSwip) {
                    Toast.makeText(context, "clicking ", Toast.LENGTH_SHORT).show();
                    //跳转到详情页面
                    this.listener.onClick();
                    break;
                }
                //判断一下滑动的方向
                if (swipeMenu != null) {
                    closeMenu();
                }
                if (getScrollX() >= getChildAt(1).getMeasuredWidth() / 2) {
                    haveShowRight = true;
                    swipeMenu = this;
                    smoothScrollTo(getChildAt(1).getMeasuredWidth(), 0);
                } else {
                    haveShowRight = false;
                    smoothScrollTo(0, 0);
                }

                break;

        }
        return true;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new MarginLayoutParams(getContext(), attrs);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //测量子view
        measureChildren(widthMeasureSpec, heightMeasureSpec);

        int width = MeasureSpec.getSize(widthMeasureSpec);
        View child = getChildAt(0);
//        int margin = ((MarginLayoutParams) child.getLayoutParams()).topMargin +
//                ((MarginLayoutParams) child.getLayoutParams()).bottomMargin;
        //setmeasuredDimension是只设置了值,而没有mode
        setMeasuredDimension(width, getChildAt(0).getMeasuredHeight());
    }

    //而这个就是将子view放置到什么位置
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int cCount = getChildCount();
        for (int i = 0; i < cCount; i++) {
            View child = getChildAt(i);
            if (i == 0) {
                child.layout(l, t, r, b);
            } else if (i == 1) {
                child.layout(r, t, r + child.getMeasuredWidth(), b);
            }
        }
    }

    public interface LeftClickListener {
        void onClick();
    }

    public void setLeftClickListener(LeftClickListener listener) {
        this.listener = listener;
    }
}
