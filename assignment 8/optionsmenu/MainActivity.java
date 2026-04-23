package com.example.optionmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.optionmenu.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My Store");
    }

    // Create menu WITHOUT XML
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0, 1, 0, "Cart");
        menu.add(0, 2, 1, "Orders");
        menu.add(0, 3, 2, "Wishlist");

        return true;
    }

    // Handle clicks
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {

            case 1:
                Toast.makeText(this, "Cart Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case 2:
                Toast.makeText(this, "Orders Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case 3:
                Toast.makeText(this, "Wishlist Clicked", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}