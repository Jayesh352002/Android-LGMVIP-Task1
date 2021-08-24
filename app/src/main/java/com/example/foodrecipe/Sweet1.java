package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Sweet1 extends AppCompatActivity {
    YouTubePlayerView view ;
    int a ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet1);
        a = getIntent().getExtras().getInt("key1");
        view = findViewById(R.id.youtube_player_view);
        if(a==1)
        {
            view.setId(Integer.parseInt("v4ZRuZgFrZA"));
        }
        else if(a==2)
        {
            view.setId(Integer.parseInt("Do9mk9mya_A"));
        }
        else if(a==3)
        {
            view.setId(Integer.parseInt("zIKIw4lkSoM"));
        }
        else if(a==4)
        {
            view.setId(Integer.parseInt("qbJMZ5H0aGg"));
        }
        else if(a==5)
        {
            view.setId(Integer.parseInt("cVFiZMxvupWM"));
        }
        else if(a==6)
        {
            view.setId(Integer.parseInt("M7vbHUOgAKw"));
        }
        else if(a==7)
        {
            view.setId(Integer.parseInt("wCuiuzmesk8"));
        }
        else if(a==8)
        {
            view.setId(Integer.parseInt("_SH4cnA_8kE"));
        }
        else if(a==9)
        {
            view.setId(Integer.parseInt("poDHwIVUSVg"));
        }
        else if(a==10)
        {
            view.setId(Integer.parseInt("lhyHIGO0lHw"));
        }
        else if(a==11)
        {
            view.setId(Integer.parseInt("fIebwiemcV8"));
        }
        else if(a==12)
        {
            view.setId(Integer.parseInt("K6sNNnjTEQ4"));
        }
        else if(a==13)
        {
            view.setId(Integer.parseInt("gBuga_Fb5_4"));
        }
        else if(a==14)
        {
            view.setId(Integer.parseInt("Og5sRXe59Kw"));
        }
        else if(a==15)
        {
            view.setId(Integer.parseInt("Npdraq_deho"));
        }
        else if(a==16)
        {
            view.setId(Integer.parseInt("pLaHZoBPmVA"));
        }
        else if(a==17)
        {
            view.setId(Integer.parseInt("UHYGGmkkM8w"));
        }
        else if(a==18)
        {
            view.setId(Integer.parseInt("Ag9Id4Wiv90"));
        }
        else if(a==19)
        {
            view.setId(Integer.parseInt("CNJBC-TJJTA"));
        }
        else if(a==20)
        {
            view.setId(Integer.parseInt("jTkjxOshLnM"));
        }
        else if(a==21)
        {
            view.setId(Integer.parseInt("2E-JGuRE0Lk"));
        }
        else if(a==22)
        {
            view.setId(Integer.parseInt("ZIc3qA-5CVw"));
        }





















    }
}