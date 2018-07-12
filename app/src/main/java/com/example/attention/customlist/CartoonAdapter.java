package com.example.attention.customlist;

import  android.content.Context;
import  android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import  java.util.ArrayList;


public class CartoonAdapter extends ArrayAdapter<Cartoon> {

    private Context context;
    private  ArrayList<Cartoon> cartoons;

    public CartoonAdapter(@NonNull Context context, ArrayList<Cartoon> cartoons) {
        super(context,  0,cartoons);
        this.context = context;
        this.cartoons =cartoons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;

        if (row==null)
        {
            row = LayoutInflater.from(context).inflate(R.layout.listview,parent,false);
        }
        Cartoon cartoon =cartoons.get(position);
        if (row!=null)
        {
            ImageView imageView=row.findViewById(R.id.imageView);
            imageView.setImageResource(cartoon.getImage());

            TextView textViewName =row.findViewById(R.id.textView_name);
            textViewName.setText(cartoon.getName());

            TextView textViewAboout =row.findViewById(R.id.textView_about);
            textViewAboout.setText(cartoon.getAbout());

        }

    return row;
}
}
