package com.johnsmith.zawmoehtike.big9eg.api;

import com.johnsmith.zawmoehtike.big9eg.model.Big9Data;

import retrofit2.Call;
import retrofit2.http.GET;

/*
    Created at 29/03/19 by Zaw Moe Htike
 */
public interface ApiService {

    @GET("home/home_test.json")
    Call<Big9Data> getMyJSON();
}
