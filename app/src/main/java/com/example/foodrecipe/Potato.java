package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Potato extends AppCompatActivity {
    String name[] ={"Spiral Potato","Dum Aloo","Aloo Manchurian","Mint Potato","Potato Bites","Aloo Fry","Special Potato Bites"};
    String time[] ={"Time Span : 20 Mins","Time Span : 15 Mins","Time Span : 25 Mins","Time Span : 20 Mins","Time Span : 15 Mins","Time Span : 10 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.po1,R.drawable.po2,R.drawable.po3,R.drawable.po4,R.drawable.po5,R.drawable.po6,R.drawable.po7};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato);
        listView = findViewById(R.id.list_view);
        PotatoAdapter listAdapter = new PotatoAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}