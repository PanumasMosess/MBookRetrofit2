package com.juck.jxk.mbookretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by JXK on 17/11/2560.
 */

public class Banner {
    @SerializedName("banner_id")
    @Expose
    private String bannerId;
    @SerializedName("banner_name")
    @Expose
    private String bannerName;
    @SerializedName("banner_image")
    @Expose
    private String bannerImage;
    @SerializedName("banner_link")
    @Expose
    private String bannerLink;
    @SerializedName("book_id")
    @Expose
    private String bookId;
    @SerializedName("banner_action")
    @Expose
    private String bannerAction;

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getBannerLink() {
        return bannerLink;
    }

    public void setBannerLink(String bannerLink) {
        this.bannerLink = bannerLink;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBannerAction() {
        return bannerAction;
    }

    public void setBannerAction(String bannerAction) {
        this.bannerAction = bannerAction;
    }

}
