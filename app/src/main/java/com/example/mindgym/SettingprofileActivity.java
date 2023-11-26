package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingprofileActivity extends AppCompatActivity {

    private ImageView backBtn1;
    private TextView logouts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingprofile);

        backBtn1 = (ImageView) findViewById (R.id.backBtn1);

        // -------- back ----------
        backBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
        //-----------------

    }
    public void openProfile(){
        Intent intentback = new Intent(this, ProfileActivity.class);
        startActivity(intentback);
    }
    //-------- logout

}