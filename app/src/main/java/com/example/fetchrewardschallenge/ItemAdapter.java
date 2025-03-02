package com.example.fetchrewardschallenge;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fetchrewardschallenge.model.Item;
import java.util.List;

/**
 * Adapter class for displaying items in a RecyclerView.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> itemList; // List of items to display

    // Constructor to initialize the adapter with data
    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    /**
     * Called when RecyclerView needs a new ViewHolder.
     * This inflates the layout for each list item.
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for a single item row
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    /**
     * Called by RecyclerView to display data at a specific position.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the current item
        Item item = itemList.get(position);

        // Set item data to views
        holder.textViewId.setText(String.valueOf(item.getId()));
        holder.textViewListId.setText(String.valueOf(item.getListId()));
        holder.textViewName.setText(item.getName());
    }

    /**
     * Returns the total number of items in the dataset.
     */
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    /**
     * ViewHolder class to hold item layout views.
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewId, textViewListId, textViewName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Initialize views
            textViewId = itemView.findViewById(R.id.textViewId);
            textViewListId = itemView.findViewById(R.id.textViewListId);
            textViewName = itemView.findViewById(R.id.textViewName);
        }
    }
}
