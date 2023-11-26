package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PerformanceActivity extends AppCompatActivity {
    ImageView imageView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance)                 ;

        imageView9 = (ImageView) findViewById(R.id.imageView9);

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPerfomance2Activity();
            }
        });


    }
    public void openPerfomance2Activity(){
        Intent intente = new Intent( this, Performance2Activity.class);
        startActivity(intente);
    }
}