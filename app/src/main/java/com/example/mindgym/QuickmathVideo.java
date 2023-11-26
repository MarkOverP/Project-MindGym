package com.example.mindgym;

import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class QuickmathVideo extends AppCompatActivity {
    VideoView vv;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quickmath);
        vv=findViewById(R.id.vv);
        vv.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vdo);
    }
}