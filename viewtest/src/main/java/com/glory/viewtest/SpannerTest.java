package com.glory.viewtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by glorizz on 2018/7/26
 * Describe:
 */
public class SpannerTest extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spanner);
        Spinner spinner = findViewById(R.id.spinner);
        List<String> listStr = new ArrayList<>();
        listStr.add("beijing");
        listStr.add("zhangjiakou");
        listStr.add("shijiazhuang");
        listStr.add("hengshui");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,
                listStr);
        spinner.setPrompt("全部");
        spinner.setAdapter(arrayAdapter);
    }
}
