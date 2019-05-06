package com.glory.retrofittest.retrofit;

import com.glory.retrofittest.FazhiBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Create by glorizz on 2018/7/17
 * Describe:
 */
public interface ApiStore {
//     String API_SERVER_URL = "http://124.205.9.251:8082/";//北京
     String API_SERVER_URL = "http://123.59.199.45:8188/";//北京

    //轮播图
//    @POST("/mobile/index/noticeList")
//    Call<BannerModel> bannerData(@Query("notice_type") String notice_type);

    //轮播图
    @GET("ClphPressService/flaw/ruleClass?tdsourcetag=s_pctim_aiomsg")
    Call<FazhiBean> fazhiData();


}
