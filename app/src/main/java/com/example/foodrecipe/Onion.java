package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Onion extends AppCompatActivity {
    String name[] ={"Onion Mix","Laccha Pyaz","Pyaz ki Sabji","Onion Curry"};
    String time[] ={"Time Span : 15 Mins","Time Span : 25 Mins","Time Span : 10 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.on1,R.drawable.on2,R.drawable.on3,R.drawable.on4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onion);
        listView = findViewById(R.id.list_view);
        OnionAdapter listAdapter = new OnionAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}