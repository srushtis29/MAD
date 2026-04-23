package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] title, desc, price;
    int[] images;

    public CustomAdapter(Activity context, String[] title,
                         String[] desc, String[] price, int[] images) {
        super(context, R.layout.row_item, title);
        this.context = context;
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.images = images;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.row_item, null, true);

        ImageView img = rowView.findViewById(R.id.imgFood);
        TextView txtTitle = rowView.findViewById(R.id.txtTitle);
        TextView txtDesc = rowView.findViewById(R.id.txtDesc);
        TextView txtPrice = rowView.findViewById(R.id.txtPrice);

        img.setImageResource(images[position]);
        txtTitle.setText(title[position]);
        txtDesc.setText(desc[position]);
        txtPrice.setText(price[position]);

        return rowView;
    }
}