package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChannaButter extends AppCompatActivity {
    Button b1 , b2 ;
    View v ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channa_butter);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        v = findViewById(R.id.view1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ChannaButter.this,ChannaButterVideo.class);
                startActivity(x);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ChannaButter.this,ChannaButterVideo.class);
                startActivity(x);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(ChannaButter.this,ChannaButterVideo.class);
                startActivity(x);
            }
        });
    }
}