package com.example.countactivity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.countactivity.R
import com.example.countactivity.model.doaharian

class Doaharianadapter(val data : ArrayList<doaharian>)
    :RecyclerView.Adapter
     <Doaharianadapter.doaharianviewholder> ()

{
    class doaharianviewholder(view: View)
        :RecyclerView.ViewHolder(view)
    {
    val tvJuduldoa : TextView = view.findViewById(R.id.tvjuduldoa)
        val doaarab: TextView = view.findViewById(R.id.tvdoaarab)
        val doalatin : TextView = view.findViewById(R.id.tvdoalatin)
        val ibCollapse:ImageButton = view.findViewById(R.id.ibcollapse)
        val rlisidoa : RelativeLayout =view.findViewById(R.id.rlisidoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): doaharianviewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_harian,parent,false)
        return doaharianviewholder(view)
    }
    override fun onBindViewHolder(holder: doaharianviewholder, position: Int) {
        val  item = data.get(position)
        holder.tvJuduldoa.text = item.judul
        holder.doaarab.text = item.textarab
        holder.doalatin.text = item.textlatin
        holder.ibCollapse.setOnClickListener{
            if(holder.rlisidoa.visibility == View.GONE){
                holder.rlisidoa.visibility = View.VISIBLE
            }else{
                holder.rlisidoa.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int =data.size






}