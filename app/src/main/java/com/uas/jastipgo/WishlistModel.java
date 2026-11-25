package com.uas.jastipgo;

public class WishlistModel {
    private String title;
    private String country;
    private int offerCount;

    public WishlistModel(String title, String country, int offerCount) {
        this.title = title;
        this.country = country;
        this.offerCount = offerCount;
    }

    public String getTitle() { return title; }
    public String getCountry() { return country; }
    public int getOfferCount() { return offerCount; }
}
