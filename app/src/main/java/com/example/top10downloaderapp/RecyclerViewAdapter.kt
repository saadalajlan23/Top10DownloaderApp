package com.example.top10downloaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_feed_item.view.*

class RecyclerViewAdapter (private val items:ArrayList<FeedEntry>): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
var  number = 1
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val tvName : TextView = itemView.name_tv
        val tvNumber : TextView = itemView.number_tv



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.rv_feed_item,
            parent,
            false
        )
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holderMy: MyViewHolder, position: Int) {
        val title =items[position].name


        holderMy.tvName.text = title
        holderMy.tvNumber.text = "${number.toString()}-"
number++
    }

    override fun getItemCount(): Int {
        return items.size
    }


}