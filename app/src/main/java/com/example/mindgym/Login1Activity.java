package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Login1Activity extends AppCompatActivity {

    EditText username ;
    EditText password ;
    Button loginButton ;
    TextView signupText ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        signupText = findViewById(R.id.signupText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("user")
                && password.getText().toString().equals("1234")){
                    Toast.makeText(Login1Activity.this,"Login Successful!",
                    Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login1Activity.this, MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Login1Activity.this,"Login Failed!",
                    Toast.LENGTH_SHORT).show();
                }
            }
        });

        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login1Activity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        }
}