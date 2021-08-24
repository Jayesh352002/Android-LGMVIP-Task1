package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class BengalGram extends AppCompatActivity {
    String name[] ={"Special Channa Chat ","Channa Masala ","Channa Dosa","Channa Protein Salad"};
    String time[] ={"Time Span : 10 Mins","Time Span : 20 Mins","Time Span : 20 Mins","Time Span : 10 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.channa1,R.drawable.channa2,R.drawable.channa3,
            R.drawable.channa4};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengal_gram);
        listView = findViewById(R.id.list_view);
        BengalGramAdapter listAdapter = new BengalGramAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}