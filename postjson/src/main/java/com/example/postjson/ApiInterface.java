package com.example.postjson;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    String URL_BASE = "http://123.59.197.176:8531/";

    @Headers("Content-Type: application/json")
    @POST("/mobile/payment/toSubmit")
    Call<MyBookPlaceOrderModel> getUser(@Query("userId") String userid );

}