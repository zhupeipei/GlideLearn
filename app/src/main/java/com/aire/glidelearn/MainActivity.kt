package com.aire.glidelearn

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

class MainActivity : AppCompatActivity() {
    val iv: ImageView by lazy { findViewById<ImageView>(R.id.main_iv) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AA.ma()
    }

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
        Glide.with(this).load(UrlConstants.IMAGE_URL).into(iv)
    }
}