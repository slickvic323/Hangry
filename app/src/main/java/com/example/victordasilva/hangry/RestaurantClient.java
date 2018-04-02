package com.example.victordasilva.hangry;

import com.loopj.android.http.AsyncHttpClient;

/**
 * Created by victordasilva on 4/2/18.
 */

public class RestaurantClient {
    private static final String API_BASE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
    private AsyncHttpClient client;

    public RestaurantClient(){
        client = new AsyncHttpClient();
    }
}
