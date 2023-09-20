package com.example.countactivity.adapterdoa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.countactivity.R
import com.example.countactivity.model.doa

class DoaAdapter(val data:ArrayList<doa>)
    :RecyclerView.Adapter<DoaAdapter.DoaViewHolder>()

{
    class DoaViewHolder(view:View)
        :RecyclerView.ViewHolder(view)
    {
        val tvDoa:TextView = view.findViewById(R.id.tvDoa)
        val ivDoa:ImageView = view.findViewById(R.id.ivDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa,parent,false)
        return DoaViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvDoa.text=item.name
        holder.ivDoa.setImageResource(item.image)

    }
}