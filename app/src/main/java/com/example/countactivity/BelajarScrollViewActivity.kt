package com.example.countactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity : AppCompatActivity() {
    var ivBg:ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)


        ivBg = findViewById(R.id.ivBg)

        Glide.with( this)
            .load(R.drawable.spark)
            .transform(BlurTransformation(25,3))
            .into(ivBg!!)
    }
}