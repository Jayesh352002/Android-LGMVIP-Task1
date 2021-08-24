package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Carrot extends AppCompatActivity {
    String name[] ={"Carrot Mix","Carrot Shole","Carrot Mix","Carrot Paratha"};
    String time[] ={"Time Span : 20 Mins","Time Span : 20 Mins","Time Span : 15 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.carrot1,R.drawable.carrot2,R.drawable.carrot3,
            R.drawable.carrot4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrot);
        listView = findViewById(R.id.list_view);
        CarrotAdapter listAdapter = new CarrotAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}