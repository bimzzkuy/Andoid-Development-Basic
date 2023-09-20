package com.example.countactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.countactivity.Adapter.Doaharianadapter
import com.example.countactivity.model.doaharian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val rvdoaharian : RecyclerView = findViewById(R.id.rvdoaharian)

        val data = arrayListOf<doaharian>(

            doaharian("ketika mendapat mimpi baik","لْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ","Alhamdulillahil ladzii qodzoo haajaati"),
            doaharian("doa bangun tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            doaharian("doa istinja","اَللّٰهُمَّ حَسِّنْ فَرْجِىْ مِنَ الْفَوَاخِشِ وَظَهِّرْ قَلْبِيْ مِنَ النِّفَاقِ","Alloohumma thahhir qolbii minan nifaaqi wa hashshin fajrii minal fawaahisyi")
        )
        val adapter = Doaharianadapter(data)
        rvdoaharian.adapter = adapter
        rvdoaharian.layoutManager =
            LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)


    }
}