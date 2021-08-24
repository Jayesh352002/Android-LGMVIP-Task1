package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class FenugreekLeaf extends AppCompatActivity {
    String name[] ={"Fenugreek Leaf Thepla","Fenugreek Leaf Kadhi","Fenugreek Leaf Puri","Special Fenugreek Leaf"};
    String time[] ={"Time Span : 15 Mins","Time Span : 20 Mins","Time Span : 10 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.feg1,R.drawable.feg2,R.drawable.feg3,R.drawable.feg4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenugreek_leaf);
        listView = findViewById(R.id.list_view);
        FleafAdapter listAdapter = new FleafAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}