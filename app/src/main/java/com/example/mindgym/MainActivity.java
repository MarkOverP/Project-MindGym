package com.example.mindgym;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ImageView recent1 ;
    ImageView recent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recent1 = (ImageView) findViewById(R.id.recent1);
        recent2 = (ImageView) findViewById(R.id.recent2);
        recent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquickmath();
            }

        });

        recent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lisning();
            }
        });

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigator);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        // Perform item selected listener
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        return true;
                    case R.id.performance:
                        startActivity(new Intent(getApplicationContext(), PerformanceActivity.class));
                        overridePendingTransition(0, 0);
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

    public void openquickmath(){
        Intent qp = new Intent( this, QuickmathVideo.class);
        startActivity(qp);
    }

    public void lisning(){
        Intent qp = new Intent( this, GamelisteningActivity.class);
        startActivity(qp);
    }
}
