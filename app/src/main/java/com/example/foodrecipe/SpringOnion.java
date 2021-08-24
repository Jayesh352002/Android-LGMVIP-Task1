package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class SpringOnion extends AppCompatActivity {
    String name[] ={"Spring Onion Aloo Mix","Special Spring Onion"};
    String time[] ={"Time Span : 20 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.so1,R.drawable.so2};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_onion);
        listView = findViewById(R.id.list_view);
        SpringAdapter listAdapter = new SpringAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}