package com.example.pc.spotify

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

/**
 * Created by PC on 12/15/2017.
 */
class CustomAdapter(val userList: ArrayList<Songs>, context: Context) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    var mcontext = context

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val songs : Songs = userList[position]
        var data =position
        holder?.textViewName?.text = songs.songName
        holder?.textViewName2?.text = songs.album
        holder!!.textViewName.text =  songs.songName
        holder.textViewName2.text = songs.album
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.song_list, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(v: View?) {
            this.customItemClick!!.onCustomItemClick(v!!, adapterPosition)
        }

        val textViewName: TextView
        val textViewName2: TextView
        val linearLayout: LinearLayout
        var customItemClick: CustomItemClick?=null

        init {
            textViewName = itemView.findViewById<TextView>(R.id.textViewUsername)
            textViewName2 = itemView.findViewById<TextView>(R.id.textViewAddress)
            linearLayout = itemView.findViewById<LinearLayout>(R.id.LinearLayout)
            itemView.setOnClickListener(this)
        }

        fun onCustomItemClick(itemClickListener: CustomItemClick){
            this.customItemClick = itemClickListener
        }
    }
}