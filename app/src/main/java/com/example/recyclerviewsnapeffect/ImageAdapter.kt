package com.example.recyclerviewsnapeffect

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ImageAdapter(private val ctx:Context):RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.row_layout_image_view, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  20
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}