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
import android.widget.Button;
import android.widget.TextView;

public class Mexicon extends AppCompatActivity {
   TextView info ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexicon);
        info = findViewById(R.id.not);
        info.postDelayed(new Runnable() {
            @Override
            public void run() {
                info.setVisibility(View.GONE);
            }
        },12000);
        LunchData obj = new LunchData("First",R.drawable.kofta,"Recipe");
        LunchData[] myListData = new LunchData[] {
                new LunchData("Chipotle Chilli", R.drawable.m1,"Recipe"),
                new LunchData("Stuffed Poblano ", R.drawable.m2,"Recipe"),
                new LunchData("Blue Corn Nachos", R.drawable.m3,"Recipe"),
                new LunchData("Black Sean Salsa", R.drawable.m4,"Recipe"),
                new LunchData("Sweet Potato Burrito", R.drawable.m5,"Recipe"),
                new LunchData("Crispy Mushroom, Spinach", R.drawable.m6,"Recipe"),
                new LunchData("Tortilla Soup", R.drawable.m7,"Recipe"),
                new LunchData("Tacos Salad", R.drawable.m8,"Recipe"),
                new LunchData("Black Bean Soup", R.drawable.m9,"Recipe"),
                new LunchData("Skinny Lime Margaritas", R.drawable.m10,"Recipe")
        };
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        MexiconAdapter adapter1 = new MexiconAdapter(this,myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
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
            Intent i = new Intent(Mexicon.this,lunchRecipes.class);
            startActivity(i);
        }
        else if(id==R.id.dinner)
        {
            Intent i = new Intent(Mexicon.this,Dinner.class);
            startActivity(i);
        }
        else if(id==R.id.breakfast)
        {
            Intent i = new Intent(Mexicon.this,Breakfast.class);
            startActivity(i);
        }
        else if(id==R.id.fastfood)
        {
            Intent i = new Intent(Mexicon.this,FastFood.class);
            startActivity(i);
        }
        else if(id==R.id.mexio)
        {
            Intent i = new Intent(Mexicon.this,Mexicon.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}