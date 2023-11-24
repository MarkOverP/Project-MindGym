package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SignupActivity extends AppCompatActivity {

    Button CreateButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        CreateButton = findViewById(R.id.CreateButton);
        TextView Tvsignup = findViewById(R.id.Tvsignup);
        CreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText Edpassword1 = findViewById(R.id.Edpassword1);
                EditText Edpassword2 = findViewById(R.id.Edpassword2);

                String password  = Edpassword1.getText().toString();
                String confirmPassword  = Edpassword2.getText().toString();

                if (!password.equals(confirmPassword)) {
                    Toast.makeText(SignupActivity.this, "Passwords is not match", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SignupActivity.this, "Create account successful!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(SignupActivity.this, Login1Activity.class);
                    startActivity(intent);
                }
            }
        });

        Tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, Login1Activity.class);
                startActivity(intent);
            }
        });
    }
}