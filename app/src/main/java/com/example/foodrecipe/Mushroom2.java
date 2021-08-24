package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Mushroom2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mushroom2);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/13786871-%E0%A4%AE%E0%A4%B6%E0%A4%B0%E0%A5%82%E0%A4%AE-%E0%A4%AE%E0%A4%B8%E0%A4%BE%E0%A4%B2%E0%A4%BE-%E0%A4%97%E0%A5%8D%E0%A4%B0%E0%A5%87%E0%A4%B5%E0%A5%80-mushroom-masala-gravy-recipe-in-hindi");
    }
}