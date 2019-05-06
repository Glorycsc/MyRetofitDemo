package com.glory.banner_viewpager_circulation;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private MyViewPagerAdapter myViewPagerAdapter;
    private List<View> viewList = new ArrayList<>();
    int currentPosition;
    private Handler changeHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //需要做的就是切换到下一个
            int current = viewPager.getCurrentItem();
            viewPager.setCurrentItem(current + 1);
            sendEmptyMessageDelayed(1, 1000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        createData();
        myViewPagerAdapter = new MyViewPagerAdapter(viewList);
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.setCurrentItem(1);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            int count = viewList.size();

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


            }

            @Override
            public void onPageSelected(int position) {
                currentPosition = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {
//                if (state != ViewPager.SCROLL_STATE_IDLE) return;
                if (state == viewPager.SCROLL_STATE_DRAGGING) {//人为的在滑动
                    shutdownAutoTask();
                } else {
                    if (currentPosition == 0) {
                        //划到了最左侧,显示倒数第二个(理论上的最后一个)
                        viewPager.setCurrentItem(count - 2, false);
                    } else if (currentPosition == count - 1) {
                        viewPager.setCurrentItem(1, false);
                    }
                    startAutoTask();
                }
            }
        });
        startAutoTask();
    }

    /**
     * 当人为手动滑动的时候,停止定时任务
     */
    private void shutdownAutoTask() {
        if (changeHandler != null) {
            changeHandler.removeMessages(1);
        }
    }

    private void startAutoTask() {
        if (changeHandler != null && !changeHandler.hasMessages(1)) {
            changeHandler.sendEmptyMessageDelayed(1, 1000);
        }
    }

    private void createData() {
        TextView tv0 = new TextView(this);
        tv0.setText("tv3");
        viewList.add(tv0);
        TextView tv1 = new TextView(this);
        tv1.setText("tv1");
        viewList.add(tv1);
        TextView tv2 = new TextView(this);
        tv2.setText("tv2");
        viewList.add(tv2);
        TextView tv3 = new TextView(this);
        tv3.setText("tv3");
        viewList.add(tv3);
        TextView tv4 = new TextView(this);
        tv4.setText("tv1");
        viewList.add(tv4);
    }

    private void addPoint() {

    }
}

class MyViewPagerAdapter extends PagerAdapter {
    private List<View> viewList;

    public MyViewPagerAdapter(List<View> viewList) {
        this.viewList = viewList;
    }

    @Override
    public int getCount() {
        return viewList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
    //需要重写的俩方法

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //将需要的添加到Viewpager
        container.addView(viewList.get(position));
        return viewList.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem( container, position, object);
        container.removeView(viewList.get(position));
    }

}
