package com.tommyputranto.myapplication.api;

import com.tommyputranto.myapplication.api.dao.SuccessDao;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Tommy Dwi Putranto on 11/04/18.
 */

public interface ApiService {
    @FormUrlEncoded
    @POST("")
    Observable<SuccessDao> postLogin(
            @Field("id") String id,
            @Field("nameImage") String nameImage,
            @Field("image") String image,
            @Field("sheet") String sheet);
}
