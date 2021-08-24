package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Peppermint extends AppCompatActivity {
    String name[] ={"Peppermint Juice","Peppermint Mint"};
    String time[] ={"Time Span : 15 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.pep1,R.drawable.pep2};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peppermint);
        listView = findViewById(R.id.list_view);
        PeppermintAdapter listAdapter = new PeppermintAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}