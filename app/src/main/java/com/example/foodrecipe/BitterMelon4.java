package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class BitterMelon4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitter_melon4);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        WebView browser = (WebView) findViewById(R.id.webview);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/12443616-%E0%A4%AC%E0%A5%87%E0%A4%B8%E0%A4%A8-%E0%A4%95%E0%A4%B0%E0%A5%87%E0%A4%B2%E0%A4%BE-%E0%A4%95%E0%A5%80-%E0%A4%B8%E0%A4%AC%E0%A5%8D%E0%A4%9C%E0%A5%80-besan-karela-ki-sabzi-recipe-in-hindi");
    }
}