package com.example.progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ProgressBar horizontalBar;
    ProgressBar secondaryBar;
    Button btnStart;

    int progressValue = 0;

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalBar = findViewById(R.id.progressHorizontal);
        secondaryBar = findViewById(R.id.progressSecondary);
        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(v -> startProgress());
    }

    private void startProgress() {
        progressValue = 0;

        new Thread(() -> {
            while (progressValue < 100) {
                progressValue += 5;

                handler.post(() -> {
                    // Update main progress
                    horizontalBar.setProgress(progressValue);

                    // Update secondary progress (buffer simulation)
                    secondaryBar.setSecondaryProgress(progressValue + 10);
                });

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}