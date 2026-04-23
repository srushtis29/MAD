package com.example.toggleexample;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Switch s1, s2, s3, s4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = findViewById(R.id.switchNotification);
        s2 = findViewById(R.id.switchSMS);
        s3 = findViewById(R.id.switchEmail);
        s4 = findViewById(R.id.switchWifi);

        s1.setOnCheckedChangeListener((b, c) ->
                Toast.makeText(this, "Notifications: " + c, Toast.LENGTH_SHORT).show());

        s2.setOnCheckedChangeListener((b, c) ->
                Toast.makeText(this, "SMS: " + c, Toast.LENGTH_SHORT).show());

        s3.setOnCheckedChangeListener((b, c) ->
                Toast.makeText(this, "Email: " + c, Toast.LENGTH_SHORT).show());

        s4.setOnCheckedChangeListener((b, c) ->
                Toast.makeText(this, "WiFi: " + c, Toast.LENGTH_SHORT).show());
    }
}