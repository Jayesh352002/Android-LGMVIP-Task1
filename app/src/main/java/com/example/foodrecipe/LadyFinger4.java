package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class LadyFinger4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lady_finger4);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://recipesinhindi.net/%E0%A4%AD%E0%A4%BF%E0%A4%82%E0%A4%A1%E0%A5%80-%E0%A4%AE%E0%A4%B8%E0%A4%BE%E0%A4%B2%E0%A4%BE-%E0%A4%95%E0%A5%88%E0%A4%B8%E0%A5%87-%E0%A4%AC%E0%A4%A8%E0%A4%BE%E0%A4%A4%E0%A5%87-%E0%A4%B9%E0%A5%88/");
    }
}