package com.aire.glidelearn

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    val iv: ImageView by lazy { findViewById<ImageView>(R.id.main_iv) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AA.ma()
    }

    var i = 0
    fun clickToLoadImage(view: View) {
//        val listener = object : RequestListener<String?, GlideDrawable> {
//            override fun onException(e: Exception?, model: String?,
//                                     target: com.bumptech.glide.request.target.Target<GlideDrawable>?,
//                                     isFirstResource: Boolean): Boolean {
//                e?.printStackTrace()
//                return false
//            }
//
//            override fun onResourceReady(resource: GlideDrawable?,
//                                         model: String?,
//                                         target: com.bumptech.glide.request.target.Target<GlideDrawable>?,
//                                         isFromMemoryCache: Boolean,
//                                         isFirstResource: Boolean): Boolean {
//                return false
//            }
//        }
//        Glide.with(this).load(UrlConstants.IMAGE_URL).listener(listener).into(iv)
        if (i == 0) {
            i = 1
            Glide.with(this).load(UrlConstants.IMAGE_URL).into(iv)
            this.iv.postDelayed(Runnable {
                startActivity(Intent(this, MainActivity2::class.java))
            }, 1000)
//            Glide.with(this).load(R.drawable.ic_launcher_background).into(iv)
        } else {
            i = 0
            Glide.with(this).load(R.mipmap.ic_launcher).into(iv)
        }
    }
}