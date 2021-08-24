package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Peas extends AppCompatActivity {
    String name[] ={"Matar Makhani","Peas Cutlet","Matar Masala","Matar Panner"};
    String time[] ={"Time Span : 20 Mins","Time Span : 20 Mins","Time Span : 15 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.peas1,R.drawable.peas2,R.drawable.peas3,R.drawable.peas4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peas);
        listView = findViewById(R.id.list_view);
        PeasAdapter listAdapter = new PeasAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}