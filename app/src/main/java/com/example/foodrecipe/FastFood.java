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

public class FastFood extends AppCompatActivity {
    TextView info ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);
        info = findViewById(R.id.not);
        info.postDelayed(new Runnable() {
            @Override
            public void run() {
                info.setVisibility(View.GONE);
            }
        },12000);
        LunchData obj = new LunchData("First",R.drawable.kofta,"Recipe");
        LunchData[] myListData = new LunchData[] {
                new LunchData("Burger", R.drawable.burger,"Recipe"),
                new LunchData("Pav Bhaji", R.drawable.pavbhaji,"Recipe"),
                new LunchData("Panner Tikka", R.drawable.pannertikka,"Recipe"),
                new LunchData("Noddles", R.drawable.noodles,"Recipe"),
                new LunchData("Misal Pav", R.drawable.misalpav,"Recipe"),
                new LunchData("Panner Chilli", R.drawable.paneerchilli,"Recipe"),
                new LunchData("Pizza", R.drawable.pizza,"Recipe"),
                new LunchData("Masala Dosa", R.drawable.masaladosa,"Recipe"),
                new LunchData("Dabeli", R.drawable.dabeli,"Recipe"),
                new LunchData("Soyabin Chilli", R.drawable.soyabin,"Recipe")
        };
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        FastFoodAdapter adapter1 = new FastFoodAdapter(this,myListData);
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
            Intent i = new Intent(FastFood.this,lunchRecipes.class);
            startActivity(i);
        }
        else if(id==R.id.dinner)
        {
            Intent i = new Intent(FastFood.this,Dinner.class);
            startActivity(i);
        }
        else if(id==R.id.breakfast)
        {
            Intent i = new Intent(FastFood.this,Breakfast.class);
            startActivity(i);
        }
        else if(id==R.id.fastfood)
        {
            Intent i = new Intent(FastFood.this,FastFood.class);
            startActivity(i);
        }
        else if(id==R.id.mexio)
        {
            Intent i = new Intent(FastFood.this,Mexicon.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}