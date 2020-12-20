package com.example.vfit_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenuView;

public class MainActivity extends AppCompatActivity {
    protected BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.feed:
                        break;
                    case R.id.connect:
                        Intent b = new Intent(MainActivity.this,connect.class);
                        startActivity(b);
                        break;
                    case R.id.profile:
                        Intent c = new Intent(MainActivity.this,profile.class);
                        startActivity(c);
                        break;
                    case R.id.exercise:
                        Intent d = new Intent(MainActivity.this,exercises.class);
                        startActivity(d);
                        break;
                }
                return false;
            }
        });
    }
}