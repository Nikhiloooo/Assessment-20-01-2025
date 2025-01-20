package com.example.exam

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var myTextView: TextView = itemView.findViewById(R.id.text_item)


}