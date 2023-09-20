package com.example.countactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.countactivity.Adapter.LanguageAdapter
import com.example.countactivity.model.Language

class ListPemogramanActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemograman)
        val rvBahasaPemograman: RecyclerView =
            findViewById(R.id.rvbahasapemograman)
        val data = arrayListOf<Language>(
            Language("malay",R.drawable.malay),
            Language("python",R.drawable.python),
            Language("c++",R.drawable.cplus),
            Language("malay",R.drawable.malay),
            Language("python",R.drawable.python),
            Language("c++",R.drawable.cplus),
            Language("malay",R.drawable.malay),
            Language("python",R.drawable.python),
            Language("c++",R.drawable.cplus)
        )

        val adapter = LanguageAdapter(data)

        rvBahasaPemograman.adapter = adapter

        rvBahasaPemograman.layoutManager =
            LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)
    }
}