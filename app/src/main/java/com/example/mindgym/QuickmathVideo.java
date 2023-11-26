package com.example.mindgym;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class QuickmathVideo extends AppCompatActivity {
    VideoView vv;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quickmath);



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

    }
}