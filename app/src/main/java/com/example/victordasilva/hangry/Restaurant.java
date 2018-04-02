package com.example.victordasilva.hangry;

/**
 * Created by victordasilva on 4/2/18.
 */

public class Restaurant {
    private String name;
    private String address;
    private double distanceFromLocation;
    private String[] tags;
    private int priceRange;
    private boolean openNow;

    public Restaurant(){

    }

    public String getName(){
        return name;
    }

    public String address(){
        return address;
    }

    public double getDistanceFromLocation(){
        return distanceFromLocation;
    }

    public String[] getTags(){
        return tags;
    }

    public int getPriceRange(){
        return priceRange;
    }

    public boolean getOpenNow(){
        return openNow;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setDistanceFromLocation(double distanceFromLocation){
        this.distanceFromLocation = distanceFromLocation;
    }

    public void setTags(String[] tags){
        this.tags = tags;
    }

    public void setPriceRange(int priceRange){
        this.priceRange = priceRange;
    }

    public void setOpenNow(boolean openNow){
        this.openNow = openNow;
    }
}
