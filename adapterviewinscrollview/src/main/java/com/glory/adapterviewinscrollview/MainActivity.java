package com.glory.adapterviewinscrollview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

//验证listview和gridview在scrollview中为何只显示一行
public class MainActivity extends AppCompatActivity {
    String[] strings = {"chen", "shi", "cheng", "jia","hong","jing","gaehga","gae","eaf","fae","fajie","gaehga","gae","eaf","fae","fajie","gaehga","gae","eaf","fae","fajie"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListView listView = findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(adapter);
    }
}
