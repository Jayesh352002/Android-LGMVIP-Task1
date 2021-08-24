package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class DalK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dal_k);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/11956402-%E0%A4%B0%E0%A5%87%E0%A4%B8%E0%A5%8D%E0%A4%9F%E0%A5%8B%E0%A4%B0%E0%A5%87%E0%A4%82%E0%A4%9F-%E0%A4%B8%E0%A5%8D%E0%A4%9F%E0%A4%BE%E0%A4%87%E0%A4%B2-%E0%A4%A6%E0%A4%BE%E0%A4%B2-%E0%A4%96%E0%A4%BF%E0%A4%9A%E0%A4%A1%E0%A4%BC%E0%A5%80-restaurant-style-dal-khichdi-recipe-in-hindi");
    }
}