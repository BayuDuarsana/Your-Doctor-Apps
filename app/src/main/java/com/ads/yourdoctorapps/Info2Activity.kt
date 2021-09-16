package com.ads.yourdoctorapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_info2.*

class Info2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info2)

        button3.setOnClickListener {
            finish()
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}