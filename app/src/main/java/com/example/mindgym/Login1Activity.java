package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login1Activity extends AppCompatActivity {

    EditText username ;
    EditText password ;
    Button loginButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("user")
                && password.getText().toString().equals("1234")){
                    Toast.makeText(Login1Activity.this,"Login Successful!",
                    Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Login1Activity.this,"Login Failed!",
                    Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}