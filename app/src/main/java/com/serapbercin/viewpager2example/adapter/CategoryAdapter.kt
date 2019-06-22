package com.serapbercin.viewpager2example.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter : RecyclerView.Adapter<CategoryViewHolder>() {
    var list: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(parent)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun setItem(list: MutableList<String>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list.size
}
