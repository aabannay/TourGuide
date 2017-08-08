package com.example.android.tourguide;

import android.net.Uri;

import java.net.URI;

/**
 * Created by Abz on 8/4/17.
 */

public class Attraction {
    private String name;
    private String location;
    private int imageResourceId;
    private Uri geoLocation;
    //private Time openingTime;
    //private Time closingTime;

    //constructor method
    public Attraction(String name, String location, int imageResourceId, Uri geoLocation ){
        this.name = name;
        this.location = location;
        this.imageResourceId = imageResourceId;
        this.geoLocation = geoLocation;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public Uri getGeoLocation() {
        return geoLocation;
    }
}
