package com.example.dell.quake_report;

/**
 * Created by DELL on 12/22/2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;


    public Earthquake(String Magnitude, String Location, String Date) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mDate = Date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }

}