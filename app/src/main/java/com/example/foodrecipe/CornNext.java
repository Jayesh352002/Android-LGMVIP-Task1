package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class CornNext extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corn_next);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/12577902-%E0%A4%95%E0%A5%8D%E0%A4%B0%E0%A4%BF%E0%A4%B8%E0%A5%8D%E0%A4%AA%E0%A5%80-%E0%A4%B8%E0%A5%8D%E0%A4%B5%E0%A5%80%E0%A4%9F-%E0%A4%95%E0%A5%89%E0%A4%B0%E0%A5%8D%E0%A4%A8-%E0%A4%9A%E0%A4%BF%E0%A4%B2%E0%A5%8D%E0%A4%B2%E0%A5%80-%E0%A4%9A%E0%A4%BE%E0%A4%9F-crispy-sweet-corn-chilli-chaat-recipe-in-hindi");

}}