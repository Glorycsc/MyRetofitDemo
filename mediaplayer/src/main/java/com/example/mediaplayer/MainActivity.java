package com.example.mediaplayer;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.jzvd.JZVideoPlayerStandard;


public class MainActivity extends AppCompatActivity {
    private static String u = "http://123.59.197.176:8531/static/file/201707/e5e52efd-6a1a-435c-9ed9-eab423dbc76b.mp4";
    private static String music = "http://123.59.197.176:8531/static/mp3/201805/2775de4d-37f1-47cc-8498-4b3688ad4081.mp3";
    private static String m = "http://webst.ctmus.cn/12sjf12dskjf112/res/2001/mp3/54/91/27/2130549127003000.mp3";
    private static String title = "播放测试";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JZVideoPlayerStandard jzVideoPlayerStandard = (JZVideoPlayerStandard) findViewById(R.id.video);
        jzVideoPlayerStandard.setUp(m
                , JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL, "饺子闭眼睛");
        jzVideoPlayerStandard.thumbImageView.setImageURI(Uri.parse("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640"));
        jzVideoPlayerStandard.startButton.setImageResource(R.drawable.ic_launcher_background);
    }
}