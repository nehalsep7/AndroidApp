package com.example.nehal.androidapp;

import com.example.nehal.androidapp.RetrofitModels.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by nehal on 18/10/17.
 */

public interface Api {

    @GET("catalog/search")
    Call<ResponseModel> getCatalog(@Query("page") String page, @Query("pageSize") String pageSize);
}
