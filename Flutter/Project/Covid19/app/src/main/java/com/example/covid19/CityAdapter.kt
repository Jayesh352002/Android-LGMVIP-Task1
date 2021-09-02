package com.example.covid19

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(private val context : Context) : RecyclerView.Adapter<CityAdapter.CityViewHolder>() {
    private val item : ArrayList<Cities> = ArrayList()
    private val city : ArrayList<String> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(R.layout.data, parent, false)
        return CityViewHolder(View)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val currentitem = item[position]
        holder.mrecovered_count.text = currentitem.recovered.toString()
        holder.mdeath_count.text = currentitem.deceased.toString()
        holder.mconfirmed_count.text = currentitem.confirmed.toString()
        holder.mactive_count.text = currentitem.active.toString()
        holder.mcity.setText(city.get(position))
    }

    override fun getItemCount(): Int {
        return item.size
    }

    class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mactive_count = itemView.findViewById<TextView>(R.id.active)
        val mdeath_count = itemView.findViewById<TextView>(R.id.death)
        val mrecovered_count = itemView.findViewById<TextView>(R.id.recover)
        val mconfirmed_count = itemView.findViewById<TextView>(R.id.total_case)
        val mcity = itemView.findViewById<TextView>(R.id.city)
    }

    fun updatedata(updatedata : ArrayList<Cities>,updatecity: ArrayList<String>){
        item.clear()
        item.addAll(updatedata)
        city.clear()
        city.addAll(updatecity)
        notifyDataSetChanged()
    }
}