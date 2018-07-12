package com.example.attention.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Cartoon> cartoons=new ArrayList<>();

        listView =findViewById(R.id.listView);

        cartoons.add(new Cartoon("Tom","About tom", R.drawable.jerry));
        cartoons.add(new Cartoon("jerry" ,"About jerry",R.drawable.jerry1));

        CartoonAdapter adapter =new CartoonAdapter(this,cartoons);
        listView.setAdapter(adapter);
    }
}
