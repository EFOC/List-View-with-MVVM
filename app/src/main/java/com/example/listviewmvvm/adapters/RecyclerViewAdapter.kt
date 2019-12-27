package com.example.listviewmvvm.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.listviewmvvm.R
import com.example.listviewmvvm.models.Place
import com.squareup.picasso.Picasso

class RecyclerViewAdapter(val context: Context, var places: ArrayList<Place>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private val LOG_TAG = "RecyclerViewAdapter"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_places, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(LOG_TAG, "onBindViewHolder: called")
        holder.imageName.text = places[position].placeName
        Picasso.with(context).load(places[position].placeView).into(holder.imageView)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.place_view)
        var imageName: TextView = itemView.findViewById(R.id.place_name)
    }
}