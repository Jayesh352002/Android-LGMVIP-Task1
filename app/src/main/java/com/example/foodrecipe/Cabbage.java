package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Cabbage extends AppCompatActivity {
    String name[] ={"Cabbage Kofta Curry","Aloo Cabbage Mix ","Special Cabbage","Cabbage Cutlet","Cabbage ki Sabji","Cabbage Manchurian","Cabbage Paratha",};
    String time[] ={"Time Span : 20 Mins","Time Span : 20 Mins","Time Span : 20 Mins","Time Span : 10 Mins","Time Span : 30 Mins","Time Span : 15 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.cab,R.drawable.cab1,R.drawable.cab2,R.drawable.cab3,R.drawable.cab4,R.drawable.cab5,
            R.drawable.cab6};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabbage);
        listView = findViewById(R.id.list_view);
        CabbageAdapter listAdapter = new CabbageAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}