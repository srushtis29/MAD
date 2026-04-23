package com.example.contextmenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contact = findViewById(R.id.contactText);

        // Register for context menu
        registerForContextMenu(contact);
    }

    // Create Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Select Action");
        menu.add(0, v.getId(), 0, "Call");
        menu.add(0, v.getId(), 0, "Message");
        menu.add(0, v.getId(), 0, "Delete");
    }

    // Handle Click
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if(item.getTitle() == "Call"){
            Toast.makeText(this, "Calling...", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle() == "Message"){
            Toast.makeText(this, "Messaging...", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle() == "Delete"){
            Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}