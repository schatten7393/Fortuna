package com.example.fortunaapp.activities;

import android.os.Bundle;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fortunaapp.R;
import com.example.fortunaapp.models.Category;
import com.example.fortunaapp.adapters.CategoryAdapter;

import java.util.Arrays;
import java.util.List;
import android.view.MenuItem;


public class ManageSuppliesActivity extends AppCompatActivity implements CategoryAdapter.OnCategoryClickListener {
    private RecyclerView categoryGrid;
    private List<Category> categories = Arrays.asList(
            new Category("Vegetables", R.drawable.vegetables),
            new Category("Fruits", R.drawable.fruits),
            new Category("Meat", R.drawable.meat),
            new Category("Fish", R.drawable.fish)
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_supplies);

        // Add back button to action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        categoryGrid = findViewById(R.id.categoryGrid);
        categoryGrid.setLayoutManager(new GridLayoutManager(this, 2)); // 2 columns
        CategoryAdapter adapter = new CategoryAdapter(categories, this);
        categoryGrid.setAdapter(adapter);
    }

    public void onCategoryClick(Category category) {
        Intent intent = new Intent(this, RequestSuppliesActivity.class);
        intent.putExtra("CATEGORY_NAME", category.getName());
        startActivity(intent);
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