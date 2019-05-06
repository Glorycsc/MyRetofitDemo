package com.glory.banner_doubleitem_white;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //主页面代码

        private ViewPager mViewPager;
        private LinearLayout mLinearLayoutDot;
        private int currentPosition;
        private List<ImageView> mImageViewList;
        private ImageView[] indicators;// 小圆点数组
        private String[] imageUrls = {
//                "http://img.taodiantong.cn/v55183/infoimg/2013-07/130720115322ky.jpg",
                "http://pic30.nipic.com/20130626/8174275_085522448172_2.jpg",
                "http://pic18.nipic.com/20111215/577405_080531548148_2.jpg",
//                "http://pic15.nipic.com/20110722/2912365_092519919000_2.jpg",
//                "http://pic.58pic.com/58pic/12/64/27/55U58PICrdX.jpg"
        };

        private Handler mHandler = new Handler(){
            public void handleMessage(android.os.Message msg) {
                if(msg.what == 1){
                    currentPosition++;
                    mViewPager.setCurrentItem(currentPosition);
                }
                mHandler.sendEmptyMessageDelayed(1, 1000);
            };
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initView();
            initData();
        }

        private void initData() {
            mImageViewList = new ArrayList<ImageView>();
            indicators = new ImageView[imageUrls.length];

            int size = imageUrls.length;


            for (int i = 0; i < size; i++) {
                ImageView iv = new ImageView(this);
                Glide.with(MainActivity.this).load(imageUrls[i]).into( iv);

                mImageViewList.add(iv);

                ImageView ivIndicator = new ImageView(this);
                if (i != 0) {
                    ivIndicator.setImageResource(R.drawable.choose_false);
                } else {
                    ivIndicator.setImageResource(R.drawable.choose_true);
                }
                ivIndicator.setPadding(0, 0, 20, 0);
                mLinearLayoutDot.addView(ivIndicator);
                indicators[i] = ivIndicator;
            }

            // 如果图片集合等于2，那么添加两倍图片,防止左滑动出现空白页，自行优化是一张图片的时候就不让左右滑动和轮播
            if (size <= 2) {
                for (int i = size; i < size * 2; i++) {
                    ImageView iv = new ImageView(this);
                    Glide.with(MainActivity.this).load(imageUrls[i % size]).into( iv);

                    mImageViewList.add(iv);
                }
            }


            mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                @Override
                public void onPageSelected(int arg0) {
                    //设置小圆点
                    setCurrentIndicator(arg0 % imageUrls.length);
                    currentPosition = arg0;
                }
                @Override
                public void onPageScrolled(int arg0, float arg1, int arg2) {
                }
                @Override
                public void onPageScrollStateChanged(int arg0) {
                }
            });
            BannerViewPagerAdapter adapter = new BannerViewPagerAdapter();
            mViewPager.setAdapter(adapter);
            mViewPager.setCurrentItem(5000);
            mHandler.sendEmptyMessageDelayed(1, 2000);

        }



        private void initView() {
            mViewPager = (ViewPager) findViewById(R.id.viewpager);
            mLinearLayoutDot = (LinearLayout) findViewById(R.id.ll_dot);
        }

        private class BannerViewPagerAdapter extends PagerAdapter {

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView iv = mImageViewList.get(position % imageUrls.length);

                if(iv.getParent() != null){
                    ((ViewGroup)iv.getParent()).removeView(iv);
                }
                container.addView(iv);

                return iv;
            }
            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
            }
            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {
                return arg0 == arg1;
            }
            @Override
            public int getCount() {
                return Integer.MAX_VALUE;
            }
        }

        /***
         * 设置选中小圆点

         */
        protected void setCurrentIndicator(int currentPosition) {
            for (int i = 0; i < indicators.length; i++) {
                if (i != currentPosition) {
                    indicators[i].setImageResource(R.drawable.choose_false);
                } else {
                    indicators[i].setImageResource(R.drawable.choose_true);
                }
            }


    }


}
