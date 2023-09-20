package com.example.countactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class homeActivity : AppCompatActivity() {
    var btnshare:MaterialButton?=null
    var btnpindah:MaterialButton?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnshare = findViewById(R.id.btnshare)
        btnpindah = findViewById(R.id.btnpindah)

        //action ketik btn pindah di klik
        btnpindah!!.setOnClickListener{
            val intent = Intent(this,detailActivity::class.java)
            startActivity(intent)
        }

        btnshare!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"saya pesen matcha lenathea!")
            intent.setType("text/palin")
            startActivity(Intent.createChooser(intent,"share to:"))
        }

    }
}