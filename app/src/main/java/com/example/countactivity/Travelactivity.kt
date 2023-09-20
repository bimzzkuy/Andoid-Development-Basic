package com.example.countactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Travelactivity : AppCompatActivity() {

    var ibCall : ImageButton? =null
    var ibShare : ImageButton? =null
    var ibNavigative : ImageButton? =null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travelactivity)

        ibCall = findViewById(R.id.ibCall)
        ibNavigative = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener{
            val phonenumber = "130206"
            val phoneIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("tel: $phonenumber"))
            startActivity(phoneIntent)
        }
        ibNavigative!!.setOnClickListener{
            val mapIntent = Intent(Intent.ACTION_VIEW,
            Uri.parse("geo:-6.573484961017125, 106.79004074334041")
            )
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }

    }
}