package com.juck.jxk.mbookretrofit2.model;

/**
 * Created by JXK on 17/11/2560.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class DataManager {
    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
