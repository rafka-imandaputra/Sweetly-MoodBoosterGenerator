package com.raffcodegallery.sweetly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient
import android.content.Intent
import android.widget.Toast

class YoutubeActivity : AppCompatActivity() {
    private var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val keyword = intent.getStringExtra("query")
        val nama = intent.getStringExtra("nama")
        var tautan = "https://www.youtube.com/results?search_query=" + keyword

        Toast.makeText(this, nama + " selamat menikmati lagu kesukaanmu ya!", Toast.LENGTH_SHORT).show()

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        webView = findViewById(R.id.wV1)
        webView!!.webViewClient = WebViewClient()
        webView!!.loadUrl(tautan)
        var webSettings = webView!!.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()){
            webView!!.goBack()
        } else{
            super.onBackPressed()
        }
    }
}

