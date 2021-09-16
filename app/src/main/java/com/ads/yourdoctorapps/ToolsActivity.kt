package com.ads.yourdoctorapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tools.*

class ToolsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tools)

        Toast.makeText(this,"Load the website.....", Toast.LENGTH_SHORT).show()

        webview.loadUrl("https://satupersen.net/quiz/tes-sehat-mental")
        webview.settings.javaScriptEnabled


    }
}