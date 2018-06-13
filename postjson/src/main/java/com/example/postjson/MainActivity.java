package com.example.postjson;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<MyBookPlaceOrderModel> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();


        //公共参数
        builder.addInterceptor(new CommonParameter());

        OkHttpClient okHttpClient = builder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.URL_BASE)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);


        // prepare call in Retrofit 2.0
        try {
            JSONObject paramObject = new JSONObject();
            paramObject.put("itemIds", "6767");
            paramObject.put("bookId", "4384984938943");
            paramObject.put("counts", "44");

            Call<MyBookPlaceOrderModel> userCall = apiInterface.getUser("2283");
            userCall.enqueue(this);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onResponse(Call<MyBookPlaceOrderModel> call, Response<MyBookPlaceOrderModel> response) {
        Log.e("glz", response.code() + "" + response.message());
        Log.e("glz", response.toString());
    }

    @Override
    public void onFailure(Call<MyBookPlaceOrderModel> call, Throwable t) {
        Log.e("glz", t.getMessage().toString());
    }

    private static class CommonParameter implements Interceptor {

        private String authToken = "MDJhNjg3MGQtNWQ4My00MWE3LTg1ZWItOTYzNTY1MzkyZjhiPzE1MjQ3OTY5Nzc4MDk=";

        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            //获取当前的请求,从链上拦截下来
            Request originalRequest = chain.request();
            HttpUrl modifiedUrl = originalRequest.url().newBuilder()
                    .addEncodedQueryParameter("cartItemIds", "%5B%7BbookId%3A6436%2Ccounts%3A1%2CitemIds%3A449%7D%2C%7BbookId%3A6989%2Ccounts%3A1%2CitemIds%3A447%7D%5D")
                    .addQueryParameter("auto", authToken)
                    .addQueryParameter("platform", "android")
                    .build();

            //创建一个新的请求
            Request request = originalRequest.newBuilder().url(modifiedUrl).build();
            //添加到链上
            Log.e("glzre", request.toString() + "");
            Log.e("glzee", request.body().toString());
            return chain.proceed(request);
        }
    }
}
