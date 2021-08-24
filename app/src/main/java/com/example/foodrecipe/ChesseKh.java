package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class ChesseKh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chesse_kh);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/12272386-%E0%A4%AC%E0%A5%87%E0%A4%95%E0%A5%8D%E0%A4%A1-%E0%A4%9A%E0%A5%80%E0%A4%9C%E0%A5%80-%E0%A4%96%E0%A4%BF%E0%A4%9A%E0%A4%A1%E0%A4%BC%E0%A5%80-baked-cheese-khichdi-recipe-in-hindi");
    }
}