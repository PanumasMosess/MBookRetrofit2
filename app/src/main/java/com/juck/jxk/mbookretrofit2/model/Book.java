package com.juck.jxk.mbookretrofit2.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by JXK on 17/11/2560.
 */

public class Book {
    @SerializedName("book_id")
    @Expose
    private String bookId;
    @SerializedName("book_name")
    @Expose
    private String bookName;
    @SerializedName("publisher_name")
    @Expose
    private String publisherName;
    @SerializedName("book_price")
    @Expose
    private String bookPrice;
    @SerializedName("tag_name")
    @Expose
    private String tagName;
    @SerializedName("tag_name_2")
    @Expose
    private Object tagName2;
    @SerializedName("tag_color")
    @Expose
    private String tagColor;
    @SerializedName("tag_color_2")
    @Expose
    private String tagColor2;
    @SerializedName("book_total")
    @Expose
    private String bookTotal;
    @SerializedName("book_image")
    @Expose
    private String bookImage;
    @SerializedName("in_stock")
    @Expose
    private String inStock;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Object getTagName2() {
        return tagName2;
    }

    public void setTagName2(Object tagName2) {
        this.tagName2 = tagName2;
    }

    public String getTagColor() {
        return tagColor;
    }

    public void setTagColor(String tagColor) {
        this.tagColor = tagColor;
    }

    public String getTagColor2() {
        return tagColor2;
    }

    public void setTagColor2(String tagColor2) {
        this.tagColor2 = tagColor2;
    }

    public String getBookTotal() {
        return bookTotal;
    }

    public void setBookTotal(String bookTotal) {
        this.bookTotal = bookTotal;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }
}
