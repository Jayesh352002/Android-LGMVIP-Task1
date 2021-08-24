package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Capsicum extends AppCompatActivity {
    String name[] ={"Capsicum Onion Mix ","Special Capsicum","Fry Capsicum","Stuffed Capsicum","Capsicum Aloo Mix","Fry Capsicum","Capsicum Masala Curry"};
    String time[] ={"Time Span : 20 Mins","Time Span : 15 Mins","Time Span : 15 Mins","Time Span : 25 Mins","Time Span : 20 Mins","Time Span : 10 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.caps1,R.drawable.caps2,R.drawable.caps3,R.drawable.caps4,R.drawable.caps5,R.drawable.caps6,
            R.drawable.caps7};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capsicum);
        listView = findViewById(R.id.list_view);
        CapAdapter listAdapter = new CapAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}