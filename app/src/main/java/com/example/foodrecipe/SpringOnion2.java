package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class SpringOnion2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_onion2);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://secretindianrecipe.com/recipe/%E0%A4%B9%E0%A4%B0%E0%A5%87-%E0%A4%AA%E0%A5%8D%E0%A4%AF%E0%A4%BE%E0%A4%9C-%E0%A4%95%E0%A5%80-%E0%A4%B8%E0%A4%AC%E0%A5%8D%E0%A4%9C%E0%A5%80-%E0%A4%9C%E0%A4%BF%E0%A4%B8%E0%A5%87-%E0%A4%96%E0%A4%BE%E0%A4%95%E0%A4%B0-%E0%A4%89%E0%A4%82%E0%A4%97%E0%A4%B2%E0%A4%BF%E0%A4%AF%E0%A4%BE-%E0%A4%9A%E0%A4%BE%E0%A4%9F%E0%A4%A4%E0%A5%87-%E0%A4%B0%E0%A4%B9%E0%A5%87-%E0%A4%9C%E0%A4%BE%E0%A4%93%E0%A4%97%E0%A5%87-spring-onion-sabzi-hare-pyaz-ki-sabzi%E0%A4%B9%E0%A4%B0%E0%A5%87");
    }
}