package com.example.matisse;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view
                = new View(this);
        view.setVisibility(View.GONE);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void checkPermissions() {
        int i = checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, 0, 0);

        switch (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)){

        }
    }
}
