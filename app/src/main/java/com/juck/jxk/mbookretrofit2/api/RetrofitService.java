package com.juck.jxk.mbookretrofit2.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by JXK on 17/11/2560.
 */

public class RetrofitService {
    private static final String ROOT_URL = "http://store.mbookstore.com";
    /**
     * Get Retrofit Instance
     */
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    /**
     * Get API Service
     *
     * @return API Service
     */
    public static apiService getMyJSON() {
        return getRetrofitInstance().create(apiService.class);
    }
}
