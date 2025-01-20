package com.example.exam

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TextAdapter : RecyclerView.Adapter<TextViewHolder>() {

    private var mutableList = mutableListOf(
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Mercury",
        "Venus",
        "Earth",
    )

    override fun getItemViewType(position: Int): Int {
        Log.e("Adapter viewType", position.toString())

        return super.getItemViewType(position)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        Log.e("Adapter viewType", viewType.toString())
        val mContext = parent.context
        val layoutInflater = LayoutInflater.from(mContext)
        val view = layoutInflater.inflate(R.layout.recycler_item, parent, false)
        return TextViewHolder(view)
    }



    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        Log.e("Adapter position", position.toString())
        val planet = mutableList[position]
        holder.myTextView.text = planet
    }

    override fun getItemCount(): Int {
        return mutableList.size
    }

}