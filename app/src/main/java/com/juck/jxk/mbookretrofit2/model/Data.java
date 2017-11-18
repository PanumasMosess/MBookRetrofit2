package com.juck.jxk.mbookretrofit2.model;

/**
 * Created by JXK on 17/11/2560.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("banner")
    @Expose
    private List<Banner> banner = null;
    @SerializedName("book")
    @Expose
    private List<Book> book = null;

    public List<Banner> getBanner() {
        return banner;
    }

    public void setBanner(List<Banner> banner) {
        this.banner = banner;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

}

