package com.example.countactivity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.countactivity.R
import com.example.countactivity.model.Language

class LanguageAdapter (val data :ArrayList<Language>)
    :RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>()
{
    class LanguageViewHolder(view:View) :
        RecyclerView.ViewHolder(view) {
            val tvBahasaPemograman : TextView = view.findViewById(R.id.tvBahasapemograman)
            val ivBahasaPemograman : ImageView = view.findViewById(R.id.ivbahasapemograman)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemograman2,parent,false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
       val item =data.get(position)
        holder.tvBahasaPemograman.text=item.name
        holder.ivBahasaPemograman.setImageResource(item.image)
    }
}


