package com.example.fetchrewardschallenge.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Singleton class to provide a Retrofit instance
 */
public class RetrofitClient {
    private static final String url = "https://fetch-hiring.s3.amazonaws.com/";
    private static Retrofit retrofit = null;

    /**
     * @return an instance of ApiService
     */
    public static ApiService getApiService() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url) // Sets the base URL
                    .addConverterFactory(GsonConverterFactory.create()) // Converts JSON to Java objects
                    .build();
        }
        return retrofit.create(ApiService.class); // Creates an instance of ApiService
    }
}
