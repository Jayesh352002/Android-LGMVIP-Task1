package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class SweetPotato extends AppCompatActivity {
    String name[] ={"Sweet Potato Halwa","Sweet Potato Curry"};
    String time[] ={"Time Span : 20 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.sweetp1,R.drawable.sweetp2};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet_potato);
        listView = findViewById(R.id.list_view);
        SweetPotatoAdapter listAdapter = new SweetPotatoAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);

    }
}