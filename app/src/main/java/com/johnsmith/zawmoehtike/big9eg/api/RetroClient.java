package com.johnsmith.zawmoehtike.big9eg.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
    Created at 29/03/19 by Zaw Moe Htike
 */
public class RetroClient {

    //  Replace ROOT_URL with yours
    private static final String ROOT_URL = "https://example.com/";

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getApiService() {
        return getRetrofitInstance().create(ApiService.class);
    }
}
