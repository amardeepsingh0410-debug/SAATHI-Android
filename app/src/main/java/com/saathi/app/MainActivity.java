package com.saathi.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.KeyEvent;

public class MainActivity extends Activity {
    private WebView web;
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        web = new WebView(this);
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setSupportZoom(false);
        web.setWebViewClient(new WebViewClient());
        setContentView(web);
        web.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() {
        if (web != null) {
            web.evaluateJavascript("(function(){var b=document.querySelector('#module .bar button');if(b&&!document.querySelector('#module').classList.contains('hidden')){b.click();return true;}return false;})()", result -> {
                if ("true".equals(result)) return;
                MainActivity.super.onBackPressed();
            });
        } else super.onBackPressed();
    }
}
