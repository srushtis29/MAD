package com.example.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    Button btnNotify;
    String CHANNEL_ID = "tech_fest_channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotify = findViewById(R.id.btnNotify);

        // ✅ Ask permission (Android 13+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }

        // ✅ Create notification channel (Android 8+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "Tech Fest Notifications",
                    NotificationManager.IMPORTANCE_HIGH
            );
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        // ✅ Button click → show notification
        btnNotify.setOnClickListener(v -> {

            NotificationCompat.Builder builder =
                    new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                            .setSmallIcon(android.R.drawable.ic_dialog_info)

                            .setContentTitle("Tech Fest Starts Today")

                            .setContentText("Join us at 10:00 AM for exciting events")

                            .setSubText("Don’t miss out!")

                            .setStyle(new NotificationCompat.BigTextStyle()
                                    .bigText("The annual Tech Fest begins today at 10:00 AM in the college auditorium. Participate in coding competitions, robotics events, and workshops. Register at the venue. Exciting prizes await!"))

                            .setPriority(NotificationCompat.PRIORITY_HIGH);

            NotificationManager manager =
                    (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

            if (manager != null) {
                manager.notify(1, builder.build());
            }
        });
    }
}