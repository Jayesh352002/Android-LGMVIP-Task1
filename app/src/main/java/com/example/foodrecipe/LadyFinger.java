package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class LadyFinger extends AppCompatActivity {
    String name[] ={"Bhendi Fry","Special Bhendi ki Sabji","Bhendi Masala","Bhendi Masala Fry"};
    String time[] ={"Time Span : 10 Mins","Time Span : 15 Mins","Time Span : 15 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.lf1,R.drawable.lf2,R.drawable.lf3,R.drawable.lf4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lady_finger);
        listView = findViewById(R.id.list_view);
        LadyFingerAdapter listAdapter = new LadyFingerAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}