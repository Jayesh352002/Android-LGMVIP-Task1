package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Tomato extends AppCompatActivity {
    String name[] ={"Stuffed Tomato Curry","Tomato Paratha","Tomato Rasam","Special Tomato Rice"};
    String time[] ={"Time Span : 15 Mins","Time Span : 15 Mins","Time Span : 25 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.tom1,R.drawable.tom2,R.drawable.tom3,R.drawable.tom4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);
        listView = findViewById(R.id.list_view);
        TomatoAdapter listAdapter = new TomatoAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}