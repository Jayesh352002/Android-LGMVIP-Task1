package com.example.foodrecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.Locale;

public class lunchRecipes extends AppCompatActivity {
    public static final Integer RecordAudioRequestCode = 1;
    private SpeechRecognizer speechRecognizer;
    private ImageView micButton;
    EditText e ;
    TextView info;
    ViewPager mViewPager;

    // images array
    int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
            R.drawable.image5};

    // Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapter;
    AutoCompleteTextView first ;
    String []a1 = {"Cauliflower (फूलगोभी)","Coriander Leaf(धनिया)","Corn (मक्का)","Red Chilli (लाल मिर्च)",
            "Carrot","Tomato (टमाटर)", "Cluster Beans (गवार फली)", "Brinjal (बैगन)","Bengal Gram (चना)","Capsicum (शिमला मिर्च)",
            "Fenugreek Leaf (हरी मेथी)","Onion (प्याज)","Potato (आलू)", "Garlic (लहसुन)","Lady Finger (भिन्डी)","Green chilli (हरी मिर्च)",
            "Mushroom (मशरुम/कुकुरमुत्ता)","Peas (मटर)" , "Peppermint (पुदीना)","Radish (मूली)","Spinach (पालक)",
            "Spring Onion (हरा प्याज़)","Sweet Potato (शकर कन्द)","Cabbage(पत्ता गोभी)","Pumpkin (कद्दू)",
            "Bitter Melon(करेला)","keri (कैरी)"};
    String  s2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_recipes);
        LunchData obj = new LunchData("First",R.drawable.kofta,"Recipe");
        LunchData[] myListData = new LunchData[] {
                new LunchData("Malai Kofta", R.drawable.kofta,"Recipe"),
                new LunchData("Shev Bhaji", R.drawable.shev,"Recipe"),
                new LunchData("Veg Kolhapuri", R.drawable.vegkol,"Recipe"),
                new LunchData("Kaju Masala", R.drawable.kaju,"Recipe"),
                new LunchData("Dal Tadka", R.drawable.dal,"Recipe"),
                new LunchData("Dum Aloo", R.drawable.dum,"Recipe"),
                new LunchData("Matar Panner", R.drawable.ma,"Recipe"),
                new LunchData("Palak Panner", R.drawable.palak,"Recipe"),
                new LunchData("Tava Fry Bhendi", R.drawable.fry,"Recipe"),
                new LunchData("Channa Butter Masala", R.drawable.channa,"Recipe"),
                new LunchData("Shahi Panner", R.drawable.shahi,"Recipe"),
                new LunchData("Dal Fry", R.drawable.dalfry,"Recipe"),
                new LunchData("Aloo Panner", R.drawable.aloopanner,"Recipe"),
        };
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LunchAdapter adapter1 = new LunchAdapter(this,myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter1);
        first = findViewById(R.id.secondary);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,a1);
        first.setThreshold(1);
        first.setAdapter(adapter);
       first.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                s2 = ((TextView)view).getText().toString();
                if(s2.equals("Corn (मक्का)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Corn.class);
                    startActivity(z);
                }
                else if(s2.equals("Cauliflower (फूलगोभी)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Cauliflower.class);
                    startActivity(z);
                }
                else if(s2.equals("Coriander Leaf(धनिया)"))
                {
                    Intent z = new Intent(lunchRecipes.this,CorianderLeaf.class);
                    startActivity(z);
                }
                else if(s2.equals("Red Chilli (लाल मिर्च)"))
                {
                    Intent z = new Intent(lunchRecipes.this,RedChilli.class);
                    startActivity(z);
                }
                else if(s2.equals("Carrot"))
                {
                    Intent z = new Intent(lunchRecipes.this,Carrot.class);
                    startActivity(z);
                }
                else if(s2.equals("Tomato (टमाटर)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Tomato.class);
                    startActivity(z);
                }
                else if(s2.equals("Cluster Beans (गवार फली)"))
                {
                    Intent z = new Intent(lunchRecipes.this,ClusterBeans.class);
                    startActivity(z);
                }
                else if(s2.equals("Brinjal (बैगन)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Brinjal.class);
                    startActivity(z);
                }
                else if(s2.equals("Bengal Gram (चना)"))
                {
                    Intent z = new Intent(lunchRecipes.this,BengalGram.class);
                    startActivity(z);
                }
                else if(s2.equals("Capsicum (शिमला मिर्च)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Capsicum.class);
                    startActivity(z);
                }
                else if(s2.equals("Fenugreek Leaf (हरी मेथी)"))
                {
                    Intent z = new Intent(lunchRecipes.this,FenugreekLeaf.class);
                    startActivity(z);
                }
                else if(s2.equals("Onion (प्याज)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Onion.class);
                    startActivity(z);
                }
                else if(s2.equals("Potato (आलू)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Potato.class);
                    startActivity(z);
                }
                else if(s2.equals("Garlic (लहसुन)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Garlic.class);
                    startActivity(z);
                }
                else if(s2.equals("Lady Finger (भिन्डी)"))
                {
                    Intent z = new Intent(lunchRecipes.this,LadyFinger.class);
                    startActivity(z);
                }
                else if(s2.equals("Green chilli (हरी मिर्च)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Greenchilli.class);
                    startActivity(z);
                }
                else if(s2.equals("Mushroom (मशरुम/कुकुरमुत्ता)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Mushroom.class);
                    startActivity(z);
                }
                else if(s2.equals("Peas (मटर)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Peas.class);
                    startActivity(z);
                }
                else if(s2.equals("Peppermint (पुदीना)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Peppermint.class);
                    startActivity(z);
                }
                else if(s2.equals("Radish (मूली)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Radish.class);
                    startActivity(z);
                }
                else if(s2.equals("Spinach (पालक)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Spinach.class);
                    startActivity(z);
                }
                else if(s2.equals("Spring Onion (हरा प्याज़)"))
                {
                    Intent z = new Intent(lunchRecipes.this,SpringOnion.class);
                    startActivity(z);
                }
                else if(s2.equals("Sweet Potato (शकर कन्द)"))
                {
                    Intent z = new Intent(lunchRecipes.this,SweetPotato.class);
                    startActivity(z);
                }
                else if(s2.equals("Cabbage(पत्ता गोभी)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Cabbage.class);
                    startActivity(z);
                }
                else if(s2.equals("Pumpkin (कद्दू)"))
                {
                    Intent z = new Intent(lunchRecipes.this,Pumpkin.class);
                    startActivity(z);
                }
                else if(s2.equals("Bitter Melon(करेला)"))
                {
                    Intent z = new Intent(lunchRecipes.this,BitterMelon.class);
                    startActivity(z);
                }
                else if(s2.equals("keri (कैरी)"))
                {
                    Intent z = new Intent(lunchRecipes.this,keri.class);
                    startActivity(z);
                }
            }

        });
        info = findViewById(R.id.not);
        info.postDelayed(new Runnable() {
            @Override
            public void run() {
                info.setVisibility(View.GONE);
            }
        },12000);
        // Initializing the ViewPager Object
        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);
        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(lunchRecipes.this, images);
        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);

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
            Intent i = new Intent(lunchRecipes.this,lunchRecipes.class);
            startActivity(i);
        }
        else if(id==R.id.dinner)
        {
            Intent i = new Intent(lunchRecipes.this,Dinner.class);
            startActivity(i);
        }
        else if(id==R.id.breakfast)
        {
            Intent i = new Intent(lunchRecipes.this,Breakfast.class);
            startActivity(i);
        }
        else if(id==R.id.fastfood)
        {
            Intent i = new Intent(lunchRecipes.this,FastFood.class);
            startActivity(i);
        }
        else if(id==R.id.mexio)
        {
            Intent i = new Intent(lunchRecipes.this,Mexicon.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

}