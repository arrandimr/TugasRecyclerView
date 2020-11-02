package com.example.latihanrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasrecyclerview.Users
import com.example.tugasrecyclerview.R
import kotlinx.android.synthetic.main.list.view.*

class Adapter (private val list : ArrayList<Users> ) : RecyclerView.Adapter<Adapter.Holder>() {
    class Holder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): Holder {
        return  Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder (holder: Holder, position: Int){
        holder.view.nama.text = list.get(position).name
        holder.view.harga.text = list.get(position).price
        list.get(position).gambar?.let { holder.view.gambar.setImageResource(it) }

        holder.view.setOnClickListener{
            Toast.makeText(holder.view.context, "Halo " + list.get(position).name, Toast.LENGTH_SHORT).show()
        } 
    }


}