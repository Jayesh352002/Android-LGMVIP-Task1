package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ListView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class CorianderLeaf extends AppCompatActivity {
    String name[] ={"Coriander Leaf Paratha","Coriander Leaf Pakode"};
    String time[] ={"Time Span : 15 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.cor1,R.drawable.cor2};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coriander_leaf);
        listView = findViewById(R.id.list_view);
        CleafAdapter listAdapter = new CleafAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}