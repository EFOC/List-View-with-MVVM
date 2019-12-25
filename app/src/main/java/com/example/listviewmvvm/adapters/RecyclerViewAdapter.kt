package com.example.listviewmvvm.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.listviewmvvm.R

class RecyclerViewAdapter(var context: Context, var imageNames: ArrayList<String>, var imageViews: ArrayList<String>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private val LOG_TAG = "RecyclerViewAdapter"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_places, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageViews.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(LOG_TAG, "onBindViewHolder: called")
        holder.imageName.text = imageNames[position]
        holder.imageView.setImageResource(R.drawable.abc_ic_star_black_36dp)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var imageView: ImageView
        var imageName: TextView
        var layout: RelativeLayout

        init {
            imageView = itemView.findViewById(R.id.place_view)
            imageName = itemView.findViewById(R.id.place_name)
            layout = itemView.findViewById(R.id.parent_layout)
        }
    }
}











