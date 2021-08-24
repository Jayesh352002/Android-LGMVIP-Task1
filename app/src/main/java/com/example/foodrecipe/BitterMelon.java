package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class BitterMelon extends AppCompatActivity {
    String name[] ={"Special Bitter Melon ","Bitter Melon & Onion Mix ","Karele ki Sabji","Karela ka Besan","Stuffed Bitter Melon","Bitter Melon Juice"};
    String time[] ={"Time Span : 20 Mins","Time Span : 15 Mins","Time Span : 15 Mins","Time Span : 15 Mins","Time Span : 25 Mins","Time Span : 10 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.karela1,R.drawable.karela2,R.drawable.karela3,R.drawable.karela4,R.drawable.karela5,
            R.drawable.karela6};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitter_melon);
        listView = findViewById(R.id.list_view);
        BitterMelonAdapter listAdapter = new BitterMelonAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}