package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Peppermint2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peppermint2);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/13044218-%E0%A4%AE%E0%A4%BF%E0%A4%82%E0%A4%9F-%E0%A4%AE%E0%A5%8B%E0%A4%9C%E0%A4%BF%E0%A4%A4%E0%A5%8B-mint-mojito-recipe-in-hindi");
    }
}