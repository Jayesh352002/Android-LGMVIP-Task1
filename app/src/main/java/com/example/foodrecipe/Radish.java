package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Radish extends AppCompatActivity {
    String name[] ={"Mooli ki Sabji","Rabbish Potato Mix","Mooli Paratha","Mooli ke Pakode"};
    String time[] ={"Time Span : 15 Mins","Time Span : 15 Mins","Time Span : 10 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.rad1,R.drawable.rad2,R.drawable.rad3,R.drawable.rad4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radish);
        listView = findViewById(R.id.list_view);
        RadishAdapter listAdapter = new RadishAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}