package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Mushroom extends AppCompatActivity {
    String name[] ={"Mushroom Curry","Mushroom Masala Mix","Mushroom Matar Mix"};
    String time[] ={"Time Span : 20 Mins","Time Span : 15 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.mus1,R.drawable.mus2,R.drawable.mus3};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mushroom);
        listView = findViewById(R.id.list_view);
        MushroomAdapter listAdapter = new MushroomAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}