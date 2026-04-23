package com.example.vertical;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class VerticalActivity extends AppCompatActivity {

    ImageView profilePhoto;
    TextView nameText, emailText, phoneText;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        profilePhoto = findViewById(R.id.profile_photo);
        nameText = findViewById(R.id.name);
        emailText = findViewById(R.id.email);
        phoneText = findViewById(R.id.phone);
        backButton = findViewById(R.id.back_button);

        // Set data
        profilePhoto.setImageResource(R.drawable.ic_profile);
        nameText.setText("Srushti Sathe");
        emailText.setText("srushti@example.com");
        phoneText.setText("+91 1234567890");

        // Back button action
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // go back
            }
        });
    }
}