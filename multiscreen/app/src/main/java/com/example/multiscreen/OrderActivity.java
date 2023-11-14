package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String message =intent.getStringExtra(MainActivity.MSG);
        TextView textView2;
        textView2 = findViewById(R.id.OrderText);
        textView2.setText("Your order : " + message + " has been placed");

    }
}