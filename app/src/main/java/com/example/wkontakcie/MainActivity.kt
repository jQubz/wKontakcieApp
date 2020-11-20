package com.example.wkontakcie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView = WebView(this)
        setContentView(myWebView)
        myWebView.loadUrl("https://kolobrzeska.q84fh.net/")
    }
}