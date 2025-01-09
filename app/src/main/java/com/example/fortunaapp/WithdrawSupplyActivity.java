package com.example.fortunaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WithdrawSupplyActivity extends AppCompatActivity {

    Button backButton, homeButton, profileButton;

    Spinner supplyTypeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_withdraw_supply);

        backButton = findViewById(R.id.backButton);
        homeButton = findViewById(R.id.homeButton);
        profileButton = findViewById(R.id.profileButton);
        supplyTypeSpinner = findViewById(R.id.supplyTypeSpinner);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WithdrawSupplyActivity.this, InvManDashboardActivity.class));
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WithdrawSupplyActivity.this, InvManDashboardActivity.class));
            }
        });

        /*profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WithdrawSupplyActivity.this, ProfileActivity.class));
            }
        });*/

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.supplyType,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        supplyTypeSpinner.setAdapter(adapter);
    }
}