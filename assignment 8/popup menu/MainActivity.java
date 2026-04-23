package com.example.popupmenu;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView fileIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fileIcon = findViewById(R.id.fileIcon);

        fileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(MainActivity.this, fileIcon);

                // Add menu items directly (no extra XML needed)
                popupMenu.getMenu().add("Rename");
                popupMenu.getMenu().add("Move");
                popupMenu.getMenu().add("Share");

                popupMenu.setOnMenuItemClickListener(item -> {

                    String selected = item.getTitle().toString();

                    if(selected.equals("Rename")){
                        Toast.makeText(MainActivity.this, "Rename Clicked", Toast.LENGTH_SHORT).show();
                    }
                    else if(selected.equals("Move")){
                        Toast.makeText(MainActivity.this, "Move Clicked", Toast.LENGTH_SHORT).show();
                    }
                    else if(selected.equals("Share")){
                        Toast.makeText(MainActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
                    }

                    return true;
                });

                popupMenu.show();
            }
        });
    }
}