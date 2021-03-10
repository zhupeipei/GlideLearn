package com.aire.glidelearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Glide.with(this).load(UrlConstants.IMAGE_URL).into(findViewById(R.id.main_2_iv))
    }
}