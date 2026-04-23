package com.example.checkboxdemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    CheckBox java, python, android, web, cloud, ai;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar setup
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initialize
        java = findViewById(R.id.java);
        python = findViewById(R.id.python);
        android = findViewById(R.id.android);
        web = findViewById(R.id.web);
        cloud = findViewById(R.id.cloud);
        ai = findViewById(R.id.ai);

        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {

            StringBuilder result = new StringBuilder("Selected Skills:\n");

            if(java.isChecked()) result.append("Java\n");
            if(python.isChecked()) result.append("Python\n");
            if(android.isChecked()) result.append("Android\n");
            if(web.isChecked()) result.append("Web Dev\n");
            if(cloud.isChecked()) result.append("Cloud\n");
            if(ai.isChecked()) result.append("AI\n");

            Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show();
        });
    }
}