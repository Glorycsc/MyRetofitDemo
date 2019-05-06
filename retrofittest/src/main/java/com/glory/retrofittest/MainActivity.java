package com.glory.retrofittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.glory.retrofittest.retrofit.ApiClient;
import com.glory.retrofittest.retrofit.ApiStore;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Call<FazhiBean> call = ApiClient.getRetorfit().create(ApiStore.class).fazhiData();
        call.enqueue(new Callback<FazhiBean>() {
            @Override
            public void onResponse(Call<FazhiBean> call, Response<FazhiBean> response) {
                String returnJson = response.body().getReturnJson();
                returnJson.replaceAll("\\\"", "");
                FazhiInner inner = new Gson().fromJson(returnJson, FazhiInner.class);
               Log.e("9999", inner.toString());
            }

            @Override
            public void onFailure(Call<FazhiBean> call, Throwable t) {

            }
        });
    }
}
