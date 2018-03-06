package com.example.abhinav.bbkivinesofficial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
   private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        web=findViewById(R.id.web);
        web.loadUrl("https://www.youtube.com/channel/UCqwUrj10mAEsqezcItqvwEw/playlists");
        WebSettings s=web.getSettings();
        s.setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
       if(web.canGoBack()) web.goBack();
       else super.onBackPressed();
    }
}
