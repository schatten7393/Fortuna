package com.example.fortunaapp.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fortunaapp.R;

public class ItemsActivity extends AppCompatActivity {
    private RecyclerView itemsRecyclerView;
    private TextView categoryTitleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        // Add back button to action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Initialize views
        categoryTitleView = findViewById(R.id.categoryTitle);
        itemsRecyclerView = findViewById(R.id.itemsRecyclerView);

        // Get category from intent
        String category = getIntent().getStringExtra("category");
        if (category != null && categoryTitleView != null) {
            categoryTitleView.setText(category);
        }

        // TODO: Set up RecyclerView with items adapter
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}