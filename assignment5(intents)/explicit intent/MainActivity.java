package com.example.explicit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("srushti") && pass.equals("1234")) {

                    // Explicit Intent
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("name", user);
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "Invalid Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}