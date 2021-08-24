package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Cauliflower extends AppCompatActivity {
    String name[] ={"Cauliflower Aloo Mix","Special Gobhi 65","Cauliflower Matar Mix"};
    String time[] ={"Time Span : 15 Mins","Time Span : 25 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.cau1,R.drawable.cau2,R.drawable.cau3};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cauliflower);
        listView = findViewById(R.id.list_view);
        CauAdapter listAdapter = new CauAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}