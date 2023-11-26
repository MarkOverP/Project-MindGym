package com.example.mindgym;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class QuickmathVideo extends AppCompatActivity {
    VideoView vv;
    Button nextButton;
    ImageView backBtn1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quickmath);

        VideoView VideoView1 =(VideoView) findViewById(R.id.VideoView1);
        VideoView1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rq));
        VideoView1.start();

        // เมื่อวิดีโอเล่นเสร็จแล้ว
        VideoView1.setOnCompletionListener(mp -> {
            // สร้าง Intent สำหรับเรียกใช้กิจกรรม (Activity) ใหม่
            Intent intent = new Intent(QuickmathVideo.this, ScoreActivity.class);
            startActivity(intent);

            // ปิดกิจกรรมปัจจุบัน
            finish();
        });

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