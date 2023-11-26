package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class GamelisteningActivity extends AppCompatActivity {

    ImageView backBtn1;
    VideoView LisGame;
    Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamelistening);

        VideoView LisGame =(VideoView) findViewById(R.id.LisGame);
        LisGame.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.listening));
        LisGame.start();

        backBtn1 = (ImageView) findViewById(R.id.backBtn1);
        nextButton = (Button) findViewById(R.id.nextButton);
        backBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScore();
            }
        });

//        VideoView LisGame =(VideoView) findViewById(R.id.LisGame);
//        String path = "android.resource://com.example.MindGym/"+R.raw.listening;
//        Uri u1 = Uri.parse(path);
//        LisGame.start();
    }

    public void openGame(){
        Intent intent1 = new Intent(this, GameActivity.class);
        startActivity(intent1);
    }

    public void openScore(){
        Intent intent2 = new Intent(this, ScoreActivity.class);
        startActivity(intent2);
    }
}