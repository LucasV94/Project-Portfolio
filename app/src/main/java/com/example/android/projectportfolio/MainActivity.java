package com.example.android.projectportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activateButtons();
    }


    public void showMyToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void activateButtons() {
        //Popular Movie Button Activation
        Button popular_movies = (Button) findViewById(R.id.popular_movies);
        popular_movies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showMyToast(getApplicationContext().getString(R.string.popular_movies_toast));
            }
        });

        //Stock Hawk Button Activation
        Button stock_hawk = (Button) findViewById(R.id.stock_hawk);
        stock_hawk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showMyToast(getApplicationContext().getString(R.string.stock_hawk_toast));
            }
        });

        //Build It Bigger Button Activation
        Button build_it_bigger = (Button) findViewById(R.id.build_it_bigger);
        build_it_bigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showMyToast(getApplicationContext().getString(R.string.build_it_bigger_toast));
            }
        });

        //Make Your App Material Button Activation
        Button make_your_app_material = (Button) findViewById(R.id.make_your_app_material);
        make_your_app_material.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showMyToast(getApplicationContext().getString(R.string.make_your_own_app_material_toast));
            }
        });

        //Go Ubiquitous Activation
        Button go_ubiquitous = (Button) findViewById(R.id.go_ubiquitous);
        go_ubiquitous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showMyToast(getApplicationContext().getString(R.string.go_ubiquitous_toast));
            }
        });

        //Capstone Button Activation
        Button capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showMyToast(getApplicationContext().getString(R.string.capstone_toast));
            }
        });

    }
}
