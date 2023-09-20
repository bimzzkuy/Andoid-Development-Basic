package com.example.countactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibilityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val tvtext : TextView = findViewById(R.id.tvtext)
        val btnClick:  Button = findViewById(R.id.btnClick)

        btnClick.setOnClickListener{
            if (tvtext.visibility == View.VISIBLE) {
                tvtext.visibility = View.INVISIBLE
            }else {
              tvtext.visibility = View.VISIBLE
            }

            }
        }

    }
