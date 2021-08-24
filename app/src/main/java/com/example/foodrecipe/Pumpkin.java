package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Pumpkin extends AppCompatActivity {
    String name[] ={"Pumpkin ki Sabji","Special Pumpkin","Pumpkin Cutlet","Pumpkin ki Sabji"};
    String time[] ={"Time Span : 15 Mins","Time Span : 20 Mins","Time Span : 20 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.pum1,R.drawable.pum2,R.drawable.pum3,R.drawable.pum4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pumpkin);
        listView = findViewById(R.id.list_view);
        PumpkinAdapter listAdapter = new PumpkinAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}