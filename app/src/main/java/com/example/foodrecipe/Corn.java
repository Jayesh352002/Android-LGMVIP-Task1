package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Corn extends AppCompatActivity {
    String name[] ={"Sweet Corn Chilli","Sweet Corn Vada"};
    String time[] ={"Time Span : 15 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.corn1,R.drawable.corn2};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corn);
        listView = findViewById(R.id.list_view);
        CornAdapter listAdapter = new CornAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}