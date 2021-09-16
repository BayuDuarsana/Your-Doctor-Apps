package com.ads.yourdoctorapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_youtube.*

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        Toast.makeText(this,"Please wait...", Toast.LENGTH_SHORT).show()

        youtubeview.loadUrl("https://www.youtube.com/watch?v=M5vu9vs0olc")
        youtubeview.settings.javaScriptEnabled
    }
}