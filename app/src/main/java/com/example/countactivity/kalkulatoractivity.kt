package com.example.countactivity

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class kalkulatoractivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulatoractivity)

        val angka1: TextView = findViewById(R.id.inputangka1)
        val angka2: TextView = findViewById(R.id.inputangka2)
        val persen: Button = findViewById(R.id.btnpersen)
        val bagi: Button = findViewById(R.id.btnbagi)
        val kali: Button = findViewById(R.id.btnkali)
        val kurang: Button = findViewById(R.id.btnkurang)
        val tambah: Button = findViewById(R.id.btntambah)
        val clear: Button = findViewById(R.id.btnclear)
        val hasilcalculator: TextView = findViewById(R.id.hasilcalculator)

        val builder: AlertDialog.Builder =
            AlertDialog.Builder(this@kalkulatoractivity)


        tambah.setOnClickListener{
            var countInt:Int =
                angka1.text.toString().toInt() +   angka2.text.toString().toInt()
            hasilcalculator.text = countInt.toString()
        }

        kurang.setOnClickListener{
            var countInt:Int =
                angka1.text.toString().toInt() -  angka2.text.toString().toInt()
            hasilcalculator.text = countInt.toString()
        }

        persen.setOnClickListener{
            var countInt:Int =
                angka1.text.toString().toInt() %   angka2.text.toString().toInt()
            hasilcalculator.text = countInt.toString()
        }

        bagi.setOnClickListener{
            var countInt:Int =
                angka1.text.toString().toInt() /   angka2.text.toString().toInt()
            hasilcalculator.text = countInt.toString()
        }

        kali.setOnClickListener{
            var countInt:Int =
                angka1.text.toString().toInt() * angka2.text.toString().toInt()
            hasilcalculator.text = countInt.toString()
        }

       clear.setOnClickListener{

           builder.setTitle("PERHATIAN!")
           builder.setMessage("yang bener??")
           builder.setCancelable(false)

           builder.setPositiveButton("heeh",DialogInterface.OnClickListener{dialog,which->
               hasilcalculator.text ="0"
               angka1.setText("")
               angka2.setText("") })

               builder.setNegativeButton("teu jadi", DialogInterface.OnClickListener{dialog,which-> })
                 builder.setIcon(R.drawable.baseline_info_24)
              val alertDialog:AlertDialog=builder.create()
             alertDialog.show()


       }




    }

}
