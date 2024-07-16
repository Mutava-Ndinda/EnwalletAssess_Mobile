package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView


class DetailsAdapter (val detailsList:List<Details>):RecyclerView.Adapter<DetailsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.detail_list_item, parent, false)
        return DetailsViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return detailsList.size
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        val info = detailsList[position]
        holder.tvName.text = info.name
        holder.tvAmount.text = info.amount
        holder.tvDate.text = info.date

    }
}

class DetailsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName= itemView.findViewById<TextView>(R.id.tvName)
    var tvAmount= itemView.findViewById<TextView>(R.id.tvAmount)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}

