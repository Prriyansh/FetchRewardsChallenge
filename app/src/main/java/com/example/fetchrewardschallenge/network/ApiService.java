package com.example.fetchrewardschallenge.network;

import com.example.fetchrewardschallenge.model.Item;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Defines the API endpoints for getting data
 */
public interface ApiService {
    @GET("hiring.json") // API endpoint to get data

    Call<List<Item>> getItems(); // Returns list of Items wrapped in a Retrofit Call
}
