package com.example.vfit_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class exercises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.feed:
                        break;
                    case R.id.connect:
                        Intent b = new Intent(exercises.this,connect.class);
                        startActivity(b);
                        break;
                    case R.id.profile:
                        Intent c = new Intent(exercises.this,profile.class);
                        startActivity(c);
                        break;
                    case R.id.exercise:
                        Intent d = new Intent(exercises.this,exercises.class);
                        startActivity(d);
                        break;
                }
                return false;
            }
        });
    }
}