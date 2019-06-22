package com.serapbercin.viewpager2example.adapter.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serapbercin.viewpager2example.R
import com.serapbercin.viewpager2example.util.Category
import kotlinx.android.synthetic.main.category_item.view.*

class DiffUtilCategoryItemViewHolder constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false))

    fun bind(category: Category) {
        itemView.test.text = category.name
    }
}