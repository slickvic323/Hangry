package com.example.victordasilva.hangry.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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

    public static Restaurant fromJson(JSONObject jsonObject){
        Restaurant restaurant = new Restaurant();
        try{
            restaurant.name = jsonObject.has("name") ? jsonObject.getString("name") : "";
            restaurant.address = jsonObject.has("vicinity") ? jsonObject.getString("vicinity") : "";
            // TODO: distanceFromLocation

            if(jsonObject.has("types")){
                JSONArray jsonArray = jsonObject.getJSONArray("types");
                restaurant.tags = new String[jsonArray.length()];
                for(int i=0;i<jsonArray.length();i++){
                    restaurant.tags[i] = jsonArray.getString(i);
                }
            } else{
                restaurant.tags = new String[0];
            }

            restaurant.priceRange = jsonObject.has("price_level") ? jsonObject.getInt("price_level") : null;
            // TODO: openNow

        } catch (JSONException e){
            e.printStackTrace();
        }

        return restaurant;
    }

    // Getters and Setters
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
