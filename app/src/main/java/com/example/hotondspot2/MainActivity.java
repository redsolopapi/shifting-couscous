package com.example.hotondspot2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hotondspot2.CustomerLoginActivity;
import com.example.hotondspot2.VendorLoginActivity;

public class MainActivity extends AppCompatActivity {


    private Button customer;
    private Button vendor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customer = (Button) findViewById(R.id.customer);
        vendor = (Button) findViewById(R.id.vendor);

        vendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VendorLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomerLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}