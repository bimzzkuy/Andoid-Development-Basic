package com.example.countactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.countactivity.Adapter.Doaharianadapter
import com.example.countactivity.adapterdoa.DoaAdapter
import com.example.countactivity.model.doa
import com.example.countactivity.model.doaharian

class DashboardDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)
        val rvDoa:RecyclerView = findViewById(R.id.rvdoa)

        val cvSelengkapnya:Button=
            findViewById(R.id.cvSelengkapnya)
        cvSelengkapnya.setOnClickListener{
            val intent =
                Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)

    }
        val data = arrayListOf<doa>(
            doa("Doa Makan",R.drawable.logobacaquran),
            doa( " Doa Tidur",R.drawable.logobacaquran),
            doa("Dzikir Pagi",R.drawable.logobacaquran),
            doa("Dzikir sore",R.drawable.logobacaquran),
            doa("Dzikir sholat",R.drawable.logobacaquran),
            doa("Niat sholat wajib",R.drawable.logobacaquran),
            doa("Niat sholat sunnah",R.drawable.logobacaquran),
            doa("Niat puasa",R.drawable.logobacaquran),

            )


        val adapter = DoaAdapter(data)
        rvDoa.adapter = adapter
        rvDoa.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)


    }

}