package com.example.mindgym;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Performance2Activity extends AppCompatActivity {


    ImageView imageView12;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance2)                 ;


        imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView16 = (ImageView) findViewById(R.id.imageView16);

        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerfomanceActivity();
            }

        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerfomance5Activity();
            }

        });
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerfomance7Activity();
            }

        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerfomance9Activity();
            }

        });

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigator);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.performance);

        // Perform item selected listener
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.performance:

                        return true;
                    case R.id.ItGame:
                        startActivity(new Intent(getApplicationContext(), GameActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

    }
    public void openPerfomanceActivity(){
        Intent intentee = new Intent( this, PerformanceActivity.class);
        startActivity(intentee);
    }
    public void openPerfomance5Activity(){
        Intent intenteee = new Intent( this, Performance5Activity.class);
        startActivity(intenteee);
    }
    public void openPerfomance7Activity(){
        Intent intenteee3 = new Intent( this, Performance7Activity.class);
        startActivity(intenteee3);
    }
    public void openPerfomance9Activity(){
        Intent intenteee3 = new Intent( this, Performance9Activity.class);
        startActivity(intenteee3);
    }
}