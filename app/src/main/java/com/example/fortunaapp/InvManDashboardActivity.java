package com.example.fortunaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class InvManDashboardActivity extends AppCompatActivity {


    Button logoutButton, homeButton, profileButton;

    Button addSupplyButton, withdrawSupplyButton, transactionButton, supplyRequestsButton, inventoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inv_man_dashboard);

        logoutButton = findViewById(R.id.logoutButton);
        homeButton = findViewById(R.id.homeButton);
        profileButton = findViewById(R.id.profileButton);

        addSupplyButton = findViewById(R.id.addSupplyButton);
        withdrawSupplyButton = findViewById(R.id.withdrawSupplyButton);
        transactionButton = findViewById(R.id.transactionButton);
        supplyRequestsButton = findViewById(R.id.supplyRequestsButton);
        inventoryButton = findViewById(R.id.inventoryButton);

        //Setting up the onclick methods for all the buttons

        addSupplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvManDashboardActivity.this, AddSupplyActivity.class));
            }
        });

        withdrawSupplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvManDashboardActivity.this, WithdrawSupplyActivity.class));
            }
        });

        transactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvManDashboardActivity.this, TransactionActivity.class));
            }
        });

        supplyRequestsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvManDashboardActivity.this, SupplyRequestsActivity.class));
            }
        });

        inventoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvManDashboardActivity.this, InventoryActivity.class));
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvManDashboardActivity.this, InvManDashboardActivity.class));
            }
        });

        /*logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InvManDashboardActivity.this, LoginActivity.class));
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(InvManDashboardActivity.this, ProfileActivity.class));
            }
        });*/
    }
}