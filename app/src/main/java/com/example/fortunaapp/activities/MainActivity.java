package com.example.fortunaapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fortunaapp.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupDashboardButtons();
    }

    private void setupDashboardButtons() {
        Button manageSuppliesBtn = findViewById(R.id.manageSuppliesButton);
        Button requestSuppliesBtn = findViewById(R.id.requestSuppliesButton);
        Button transactionsBtn = findViewById(R.id.transactionsButton);
        Button profileBtn = findViewById(R.id.profileButton);
        Button logoutBtn = findViewById(R.id.logoutButton);

        manageSuppliesBtn.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ManageSuppliesActivity.class)));

        requestSuppliesBtn.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, RequestSuppliesActivity.class)));
    }
}