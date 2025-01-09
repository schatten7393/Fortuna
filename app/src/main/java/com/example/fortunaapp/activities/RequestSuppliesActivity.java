package com.example.fortunaapp.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fortunaapp.R;
import com.example.fortunaapp.models.Category;

import java.util.List;
import android.view.MenuItem;

public class RequestSuppliesActivity extends AppCompatActivity {
    private EditText productNameInput;
    private EditText quantityInput;
    private EditText locationInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_supplies);

        // Add back button to action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        initializeViews();
        setupRequestButton();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initializeViews() {
        productNameInput = findViewById(R.id.productNameInput);
        quantityInput = findViewById(R.id.quantityInput);
        locationInput = findViewById(R.id.locationInput);
    }

    private void setupRequestButton() {
        Button requestButton = findViewById(R.id.requestButton);
        requestButton.setOnClickListener(v -> {
            if (validateInputs()) {
                sendRequest();
            }
        });
    }

    private boolean validateInputs() {
        return !productNameInput.getText().toString().isEmpty() &&
                !quantityInput.getText().toString().isEmpty() &&
                !locationInput.getText().toString().isEmpty();
    }

    private void sendRequest() {
        // TODO: Implement API call to send request
        Toast.makeText(this, "Request sent successfully", Toast.LENGTH_SHORT).show();
        finish();
    }

    public static class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
        private List<Category> categories;
        private OnCategoryClickListener listener;

        public interface OnCategoryClickListener {
            void onCategoryClick(Category category);
        }

        public CategoryAdapter(List<Category> categories, OnCategoryClickListener listener) {
            this.categories = categories;
            this.listener = listener;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.category_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Category category = categories.get(position);
            holder.imageView.setImageResource(category.getImageResourceId());
            holder.textView.setText(category.getName());
            holder.itemView.setOnClickListener(v -> listener.onCategoryClick(category));
        }

        @Override
        public int getItemCount() {
            return categories.size();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView textView;

            public ViewHolder(View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.categoryImage);
                textView = itemView.findViewById(R.id.categoryName);
            }
        }
    }
}