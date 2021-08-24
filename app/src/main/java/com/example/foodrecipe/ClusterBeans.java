package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ClusterBeans extends AppCompatActivity {
    String name[] ={"Cluster Beans Bhaji","Cluster Beans Bhaji","Cluster Beans Bhaji"};
    String time[] ={"Time Span : 15 Mins","Time Span : 10 Mins","Time Span : 15 Mins"};
    String button[] ={"Read Recipe","Read Recipe","Read Recipe"};
    Integer[] imageArray1={R.drawable.cl1,R.drawable.cl2,R.drawable.cl3};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cluster_beans);
        listView = findViewById(R.id.list_view);
        ClusterAdapter listAdapter = new ClusterAdapter(this,imageArray1,name,time,button);
        listView.setAdapter(listAdapter);
    }
}