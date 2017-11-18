package com.juck.jxk.mbookretrofit2.api;

import com.juck.jxk.mbookretrofit2.model.DataManager;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JXK on 17/11/2560.
 */

public interface apiService {
    @GET("/service?params=home&limit_start=0&limit_stop=100")
    Call<DataManager>  getMyJSON();
}
