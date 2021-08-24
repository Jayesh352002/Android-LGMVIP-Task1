package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class RedChilli2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_chilli2);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/12503576-%E0%A4%9A%E0%A4%BF%E0%A4%B2%E0%A5%8D%E0%A4%B2%E0%A5%80-%E0%A4%AA%E0%A5%8B%E0%A4%9F%E0%A5%88%E0%A4%9F%E0%A5%8B-chilli-potato-recipe-in-hindi");
    }
}