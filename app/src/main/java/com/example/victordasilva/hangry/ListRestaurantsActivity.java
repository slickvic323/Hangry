package com.example.victordasilva.hangry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListRestaurantsActivity extends AppCompatActivity {

    private ListView restaurantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_restaurants);

        // Set all of the private variables
        restaurantList = (ListView) findViewById(R.id.restaurantList);
    }
}
