package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class ClusterBeans1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cluster_beans1);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        WebView browser = (WebView) findViewById(R.id.webview);
        getLifecycle().addObserver(youTubePlayerView);
        browser.loadUrl("https://cookpad.com/in-hi/recipes/5362592-%E0%A4%97%E0%A5%8D%E0%A4%B5%E0%A4%BE%E0%A4%B0-%E0%A4%AB%E0%A4%B2%E0%A5%80-%E0%A4%95%E0%A5%80-%E0%A4%B8%E0%A4%AC%E0%A5%8D%E0%A4%9C%E0%A5%80-gwar-phali-ki-sabzi-recipe-in-hindi");
    }
}