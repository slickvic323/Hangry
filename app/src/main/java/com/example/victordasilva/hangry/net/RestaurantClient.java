package com.example.victordasilva.hangry.net;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;


/**
 * Created by victordasilva on 4/2/18.
 */

public class RestaurantClient {
    private static final String API_BASE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
    private AsyncHttpClient client;
    //private static final String API_KEY = ;
    private double latitude, longitude;
    private int radius;
    // Always going to be restaurant
    private final String type = "restaurant";

    public RestaurantClient(){
        client = new AsyncHttpClient();
    }

    private String getApiUrl(String relativeUrl){
        return API_BASE_URL + relativeUrl;
    }

    // Method for accessing the search API
    public void getRestaurants(final String query, JsonHttpResponseHandler handler){
        // TODO: create try catch block that uses the complete url to get restaurant info
    }

}
