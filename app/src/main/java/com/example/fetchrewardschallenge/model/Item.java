package com.example.fetchrewardschallenge.model;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a single item from the API response
 */
public class Item {
    private int id;

    @SerializedName("listId") // Maps JSON key "listId" to this variable
    private int listId;

    @SerializedName("name") // Maps JSON key "name" to this variable
    private String name;

    // Getter methods to access private fields
    public int getId() { return id; }
    public int getListId() { return listId; }
    public String getName() { return name; }
}