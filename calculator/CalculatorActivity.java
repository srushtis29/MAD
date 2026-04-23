package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    EditText num1Edit, num2Edit;
    Button addBtn, subBtn, mulBtn, divBtn, backBtn;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        num1Edit = findViewById(R.id.num1);
        num2Edit = findViewById(R.id.num2);
        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);
        mulBtn = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.divBtn);
        resultText = findViewById(R.id.resultText);
        backBtn = findViewById(R.id.backBtn);

        // Addition
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = getNumber(num1Edit);
                double n2 = getNumber(num2Edit);
                resultText.setText("Result is: " + (n1 + n2));
            }
        });

        // Subtraction
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = getNumber(num1Edit);
                double n2 = getNumber(num2Edit);
                resultText.setText("Result is: " + (n1 - n2));
            }
        });

        // Multiplication
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = getNumber(num1Edit);
                double n2 = getNumber(num2Edit);
                resultText.setText("Result is: " + (n1 * n2));
            }
        });

        // Division
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = getNumber(num1Edit);
                double n2 = getNumber(num2Edit);
                if (n2 != 0) {
                    resultText.setText("Result is: " + (n1 / n2));
                } else {
                    resultText.setText("Cannot divide by zero");
                }
            }
        });

        // Back Button
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // go back to previous activity
            }
        });
    }

    // Helper method
    private double getNumber(EditText editText) {
        String str = editText.getText().toString();
        if (str.isEmpty()) return 0;
        return Double.parseDouble(str);
    }
}