package com.example.foodrecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Sweet extends AppCompatActivity {
    TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet);
        info = findViewById(R.id.not);
        info.postDelayed(new Runnable() {
            @Override
            public void run() {
                info.setVisibility(View.GONE);
            }
        },12000);
        LunchData obj = new LunchData("First",R.drawable.kofta,"Recipe");
        LunchData[] myListData = new LunchData[] {
                new LunchData("Kaju Katli", R.drawable.kajukatli,"Recipe"),
                new LunchData("Gulab Jamun", R.drawable.gulabjamun,"Recipe"),
                new LunchData("Ghewar", R.drawable.ghewae,"Recipe"),
                new LunchData("Jalebi", R.drawable.jalebi,"Recipe"),
                new LunchData("Kalakand", R.drawable.kalakand,"Recipe"),
                new LunchData("Ladoo", R.drawable.ladoo,"Recipe"),
                new LunchData("Rasgulla", R.drawable.rasagulla,"Recipe"),
                new LunchData("Rasmalai", R.drawable.rasamali,"Recipe"),
                new LunchData("Rabri", R.drawable.rabri,"Recipe"),
                new LunchData("Peda", R.drawable.peda,"Recipe"),
                new LunchData("Gujiya", R.drawable.gujiya,"Recipe"),
                new LunchData("Phirni", R.drawable.phirni,"Recipe"),
                new LunchData("Petha", R.drawable.petha,"Recipe"),
                new LunchData("Modak", R.drawable.modak,"Recipe"),
                new LunchData("Barfi", R.drawable.barf,"Recipe"),
                new LunchData("Mysore Park", R.drawable.mysorepak,"Recipe"),
                new LunchData("Malpua", R.drawable.malpua,"Recipe"),
                new LunchData("Sandesh", R.drawable.sandesh,"Recipe"),
                new LunchData("Halwa", R.drawable.halwa,"Recipe"),
                new LunchData("Soanpapdi", R.drawable.soan,"Recipe"),
                new LunchData("Shirkhand", R.drawable.shrikhnad,"Recipe"),
                new LunchData("Nankhatai", R.drawable.nankhatai,"Recipe")
        };
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        SweetAdapter adapter1 = new SweetAdapter(this,myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.lunch)
        {
            Intent i = new Intent(Sweet.this,lunchRecipes.class);
            startActivity(i);
        }
        else if(id==R.id.dinner)
        {
            Intent i = new Intent(Sweet.this,Dinner.class);
            startActivity(i);
        }
        else if(id==R.id.breakfast)
        {
            Intent i = new Intent(Sweet.this,Breakfast.class);
            startActivity(i);
        }
        else if(id==R.id.fastfood)
        {
            Intent i = new Intent(Sweet.this,FastFood.class);
            startActivity(i);
        }
        else if(id==R.id.mexio)
        {
            Intent i = new Intent(Sweet.this,Mexicon.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}