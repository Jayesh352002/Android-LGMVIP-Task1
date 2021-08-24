package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class keri extends AppCompatActivity {
    String name[] ={"Keri Lunji","Keri Panna","Special Keri Mix"};
    String time[] ={"Time Span : 15 Mins","Time Span : 15 Mins","Time Span : 20 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.keri1,R.drawable.keri2,R.drawable.keri3};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keri);
        listView = findViewById(R.id.list_view);
        KeriAdapter listAdapter = new KeriAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}