package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Capsicum5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capsicum5);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://www.google.co.in/url?sa=i&url=https%3A%2F%2Fnishamadhulika.com%2F1379-aloo-shimla-mirch-recipe.html&psig=AOvVaw2XwOSI49WKXwuwkJibi-Aq&ust=1621403574348000&source=images&cd=vfe&ved=0CAMQjB1qFwoTCOjujtjs0_ACFQAAAAAdAAAAABAO");
    }
}