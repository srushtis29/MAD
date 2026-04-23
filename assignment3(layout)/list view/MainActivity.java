package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] title = {"Pizza", "Burger", "Pizza", "Burger", "Burger", "Mango"};
    String[] desc = {
            "Spicy Chicken Pizza",
            "Beef Burger",
            "Chicken Pizza",
            "Chicken Burger",
            "Fish Burger",
            "Mango Juice"
    };
    String[] price = {
            "RS 310.00",
            "RS 350.00",
            "RS 250.00",
            "RS 350.00",
            "RS 310.00",
            "RS 250.00"
    };

    int[] images = {
            R.drawable.pizza,
            R.drawable.burger,
            R.drawable.pizza,
            R.drawable.burger,
            R.drawable.burger,
            R.drawable.mango
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, title, desc, price, images);
        listView.setAdapter(adapter);
    }
}