package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScoreActivity extends AppCompatActivity {

    Button BackButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        BackButton = (Button) findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameActivity();
            }
        });
    }

    public void openGameActivity(){
        Intent intentbacktg = new Intent(this, GameActivity.class);
        startActivity(intentbacktg);
    }
}