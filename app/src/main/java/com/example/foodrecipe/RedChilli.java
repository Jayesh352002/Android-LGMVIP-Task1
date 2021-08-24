package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class RedChilli extends AppCompatActivity {
    String name[] ={"Red Chilli Pickle","Red Chilli Mix"};
    String time[] ={"Time Span : 20 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.red1,R.drawable.red2};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_chilli);
        listView = findViewById(R.id.list_view);
        RedChilliAdapter listAdapter = new RedChilliAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}