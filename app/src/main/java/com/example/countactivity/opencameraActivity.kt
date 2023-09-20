package com.example.countactivity

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.ActionMode
import android.widget.ImageButton
import android.widget.ImageView

class opencameraActivity : AppCompatActivity() {

    var ibcamera : ImageButton? = null
    var ivSample : ImageView? = null
    var pic_id =130206
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opencamera)

        //isi find view by id pada masing masing variable
        ibcamera = findViewById(R.id.ibcamera)
        ivSample = findViewById(R.id.ivSample)

        ibcamera!!.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }
    }

    // function ke 2 =onactivityresult
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // jika gambarnya ada
        if(requestCode == pic_id){
            val photo:Bitmap = data?.extras?.get("data") as Bitmap
            ivSample!!.setImageBitmap(photo)
    }
    }

    }


