package com.example.vfit_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class connect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.feed:
                        Intent a = new Intent(connect.this,feed.class);
                        startActivity(a);
                        break;
                    case R.id.connect:
                        break;
                    case R.id.profile:
                        Intent c = new Intent(connect.this,profile.class);
                        startActivity(c);
                        break;
                    case R.id.exercise:
                        Intent d = new Intent(connect.this,exercises.class);
                        startActivity(d);
                        break;
                }
                return false;
            }
        });
    }
}