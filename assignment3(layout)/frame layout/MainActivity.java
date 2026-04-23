package com.example.frame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout startLayout, questionLayout;
    Button btnStart, btnSubmit;
    RadioGroup radioGroup;
    RadioButton rbLinux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Edge-to-edge padding (UNCHANGED)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // INITIALIZE VIEWS
        startLayout = findViewById(R.id.startLayout);
        questionLayout = findViewById(R.id.questionLayout);
        btnStart = findViewById(R.id.btnStart);
        btnSubmit = findViewById(R.id.btnSubmit);
        radioGroup = findViewById(R.id.radioGroup);
        rbLinux = findViewById(R.id.rbLinux);

        // START QUIZ
        btnStart.setOnClickListener(v -> {
            startLayout.setVisibility(View.GONE);
            questionLayout.setVisibility(View.VISIBLE);
        });

        // SUBMIT ANSWER
        btnSubmit.setOnClickListener(v -> {
            if (radioGroup.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show();
            } else if (rbLinux.isChecked()) {
                Toast.makeText(this, "Correct Answer ✅", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Wrong Answer ❌", Toast.LENGTH_SHORT).show();
            }
        });
    }
}