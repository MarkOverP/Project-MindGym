package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScoreActivity extends AppCompatActivity {

    Button BackButton;
    Button PlayagBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        BackButton = (Button) findViewById(R.id.BackButton);
        PlayagBtn = (Button) findViewById(R.id.PlayagBtn);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        PlayagBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenGameActivity();
            }
        });
    }

    public void openHome(){
        Intent intentbacktg = new Intent(this, MainActivity.class);
        startActivity(intentbacktg);
    }

    public void OpenGameActivity(){
        Intent intentHome = new Intent(this, GameActivity.class);
        startActivity(intentHome);
    }
}