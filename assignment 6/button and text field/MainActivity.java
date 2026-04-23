package com.example.buttons;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name, email;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect XML with Java
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        btnSubmit = findViewById(R.id.btnSubmit);

        // Button Click Event
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = name.getText().toString();
                String userEmail = email.getText().toString();

                // Simple validation
                if(userName.isEmpty() || userEmail.isEmpty()){
                    Toast.makeText(MainActivity.this,
                            "Please fill all fields",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Name: " + userName + "\nEmail: " + userEmail,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}