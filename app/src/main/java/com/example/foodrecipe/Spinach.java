package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Spinach extends AppCompatActivity {
    String name[] ={"Lasooni Palak","Palak Paratha"};
    String time[] ={"Time Span : 20 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.sp1,R.drawable.sp2};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinach);
        listView = findViewById(R.id.list_view);
        SpinachAdapter listAdapter = new SpinachAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}