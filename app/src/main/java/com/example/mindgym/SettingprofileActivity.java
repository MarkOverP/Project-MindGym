package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingprofileActivity extends AppCompatActivity {

     ImageView backBtn1;
     Button logoutbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingprofile);

        backBtn1 = (ImageView) findViewById (R.id.backBtn1);
        logoutbtn = (Button) findViewById(R.id.logoutbtn);
        // -------- back ----------
        backBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
        //-----------------
        //--------- logout ----------
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openloginpage();
            }
        });
    }
    public void openProfile(){
        Intent intentback = new Intent(this, ProfileActivity.class);
        startActivity(intentback);
    }

    public void openloginpage(){
        Intent intentlo = new Intent(this, Login1Activity.class);
        startActivity(intentlo);
    }

}