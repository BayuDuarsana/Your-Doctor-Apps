package com.ads.yourdoctorapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        textView4.setOnClickListener {
            finish()
            startActivity(Intent(this,ToolsActivity::class.java))
        }

        textView6.setOnClickListener {
            finish()
            startActivity(Intent(this,YoutubeActivity::class.java))
        }

        textView5.setOnClickListener {
            finish()
            startActivity(Intent(this,InfoActivity::class.java))
        }
    }
}