package com.example.fetchrewardschallenge;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fetchrewardschallenge.model.Item;
import com.example.fetchrewardschallenge.network.ApiService;
import com.example.fetchrewardschallenge.network.RetrofitClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * This class fetches data, filter out empty/null names, sort it, and display it in a RecyclerView.
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<Item> itemList = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the UI layout

        recyclerView = findViewById(R.id.recyclerView); // Initialize RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Set layout manager

        fetchItems(); // Fetch data from API
    }

    private void fetchItems() {
        // Create an instance of the API service
        ApiService apiService = RetrofitClient.getApiService();
        Call<List<Item>> call = apiService.getItems();

        // Make an asynchronous network call
        call.enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    itemList = response.body(); // Get API response

                    // Remove items with null or empty names
                    itemList.removeIf(item -> item.getName() == null || item.getName().trim().isEmpty());

                    // Sort items: first by listId, then by name
                    Collections.sort(itemList, Comparator.comparing(Item::getListId)
                            .thenComparing(Item::getName));

                    // Set the adapter with the sorted list
                    adapter = new ItemAdapter(itemList);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {
                // Handle API call failure
                Toast.makeText(MainActivity.this, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                Log.e("API_ERROR", t.getMessage()); // Log error
            }
        });
    }
}
