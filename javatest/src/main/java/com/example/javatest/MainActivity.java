package com.example.javatest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.Utils;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Utils.init(this);


//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//显示状态栏
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.activity_main, null);
        View statusView = new View(this);

        //设置参数
        int statusHeight = getStatusbarHeight();
//        statusView.setPadding(0,statusHeight,0,0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, statusHeight);
        statusView.setBackgroundColor(getResources().getColor(R.color.testyellow));
//        statusView.setAlpha(0.1f);//完全透明
        statusView.setLayoutParams(layoutParams);
        rootView.addView(statusView, 0);
        setContentView(rootView);
        BarUtils.setStatusBarAlpha(this);
        getWindow().getDecorView().getRootView();
        tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);//显示状态栏
                Toast.makeText(MainActivity.this, "faef ", Toast.LENGTH_SHORT).show();

            }
        });
    }

    /**
     * 获取状态栏的高度
     *
     * @return
     */
    public int getStatusbarHeight() {
        int height = 0;
        //首先需要获取状态栏的高度
        //首页布局因为比较复杂和其他页面不同
        int resouceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resouceId != 0) {
            height = getResources().getDimensionPixelSize(resouceId);
        }
        return height;
    }

    public void setStatusbarColor(Context context) {
        //创建一个与statusbar同的view,来撑起布局
        View view = new View(context);
        //添加到最外层的view
        //不能直接向decorView中添加view
//        View rootView  =  getWindow().getDecorView();
//        rootView.add
//
    }
}
