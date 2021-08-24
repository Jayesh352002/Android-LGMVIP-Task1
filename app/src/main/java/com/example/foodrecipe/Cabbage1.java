package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Cabbage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabbage1);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/6455949-%E0%A4%AA%E0%A4%A4%E0%A5%8D%E0%A4%A4%E0%A4%BE-%E0%A4%97%E0%A5%8B%E0%A4%AD%E0%A5%80-%E0%A4%AE%E0%A4%9F%E0%A4%B0-%E0%A4%86%E0%A4%B2%E0%A5%82-%E0%A4%95%E0%A5%80-%E0%A4%B8%E0%A4%AC%E0%A5%8D%E0%A4%9C%E0%A5%80-patta-gobhi-matar-aloo-ki-sabji-recipe-in-hindi");
    }
}