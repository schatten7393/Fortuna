package com.example.fortunaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.fortunaapp.activities.MainActivity;

public class ChooseUserTypeActivity extends AppCompatActivity {

    Button dealerButton, inventoryManagerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_choose_user_type);

        dealerButton = findViewById(R.id.dealerButton);
        inventoryManagerButton = findViewById(R.id.inventoryManagerButton);

        //Setting up the onclick methods for all the buttons
        dealerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseUserTypeActivity.this, MainActivity.class);
                intent.setPackage("com.example.fortunaapp.activities");
                startActivity(intent);
            }
        });

        inventoryManagerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseUserTypeActivity.this, InvManDashboardActivity.class));
            }
        });
    }
}