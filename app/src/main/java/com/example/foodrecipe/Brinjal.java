package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Brinjal extends AppCompatActivity {
    String name[] ={"Special Brinjal Masala","Aloo Baingan ","Baingan Masala","Bharwa Baingan"};
    String time[] ={"Time Span : 15 Mins","Time Span : 15 Mins","Time Span : 10 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.brg1,R.drawable.brg2,R.drawable.brg3,
            R.drawable.brg4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brinjal);
        listView = findViewById(R.id.list_view);
        ListAdapter listAdapter = new ListAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);

    }
}