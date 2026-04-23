package com.example.grid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnHorizontal, btnVertical, btnCalculator,
            btnRelative, btnFrame, btnImplicit,
            btnAbsolute, btnTable, btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        btnHorizontal = findViewById(R.id.btnHorizontal);
        btnVertical   = findViewById(R.id.btnVertical);
        btnCalculator = findViewById(R.id.btnCalculator);

        btnRelative   = findViewById(R.id.btnRelative);
        btnFrame      = findViewById(R.id.btnFrame);
        btnImplicit   = findViewById(R.id.btnImplicit);

        btnAbsolute   = findViewById(R.id.btnAbsolute);
        btnTable      = findViewById(R.id.btnTable);
        btnList       = findViewById(R.id.btnList);

        // Explicit navigation (as per your setup)

        btnHorizontal.setOnClickListener(v ->
                openApp("com.example.layout",
                        "com.example.layout.MainActivity"));

        btnVertical.setOnClickListener(v ->
                openApp("com.example.vertical",
                        "com.example.vertical.VerticalActivity"));

        btnCalculator.setOnClickListener(v ->
                openApp("com.example.calculator",
                        "com.example.calculator.CalculatorActivity"));

        btnRelative.setOnClickListener(v ->
                openApp("com.example.relative",
                        "com.example.relative.MainActivity"));

        btnFrame.setOnClickListener(v ->
                openApp("com.example.frame",
                        "com.example.frame.MainActivity"));

        btnImplicit.setOnClickListener(v ->
                openApp("com.example.implicitintent",
                        "com.example.implicitintent.MainActivity"));

        btnAbsolute.setOnClickListener(v ->
                openApp("com.example.absolute",
                        "com.example.absolute.MainActivity"));

        btnTable.setOnClickListener(v ->
                openApp("com.example.table",
                        "com.example.table.MainActivity"));

        btnList.setOnClickListener(v ->
                openApp("com.example.listview",
                        "com.example.listview.MainActivity"));
    }

    private void openApp(String pkg, String cls) {
        Intent i = new Intent();
        i.setClassName(pkg, cls);
        startActivity(i);
    }
}