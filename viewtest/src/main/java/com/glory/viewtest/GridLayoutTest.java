package com.glory.viewtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Create by glorizz on 2018/7/26
 * Describe:
 */
public class GridLayoutTest extends Activity {
    private GridLayout gridLayout;
    private Button add, subtract;
    int count;
    ArrayList<ImageView> listData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayouttest);
        gridLayout = findViewById(R.id.gridlayout);
        listData = getImageArrayList();
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView image = listData.get(count);
                gridLayout.addView(image);
                count++;
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count > 9) count = 9;
                if (count < 0) return;
                gridLayout.removeView(listData.get(count));
                count--;
            }
        });

    }

    private ArrayList<ImageView> getImageArrayList() {
        ArrayList<ImageView> imageViews = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ImageView image = new ImageView(GridLayoutTest.this);
            image.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            image.setTag(count);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(80, 80);
            image.setLayoutParams(layoutParams);
            imageViews.add(image);
        }
        return imageViews;
    }
}
