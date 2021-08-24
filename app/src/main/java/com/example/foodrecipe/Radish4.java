package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Radish4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radish4);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/6447332-%E0%A4%AE%E0%A5%82%E0%A4%B2%E0%A5%80-%E0%A4%95%E0%A5%87-%E0%A4%AA%E0%A4%95%E0%A5%8B%E0%A4%A1%E0%A4%BC%E0%A5%87-mooli-ke-pakore-recipe-in-hindi");
    }
}