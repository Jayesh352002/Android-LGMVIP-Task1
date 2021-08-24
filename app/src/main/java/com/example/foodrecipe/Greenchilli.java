package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Greenchilli extends AppCompatActivity {
    String name[] ={"Green Chilli Fry","Green Chilli Pickle","Green Chilli Sabji"};
    String time[] ={"Time Span : 15 Mins","Time Span : 25 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.gc1,R.drawable.gc2,R.drawable.gc3};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greenchilli);
        listView = findViewById(R.id.list_view);
        GreenChilliAdapter listAdapter = new GreenChilliAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}