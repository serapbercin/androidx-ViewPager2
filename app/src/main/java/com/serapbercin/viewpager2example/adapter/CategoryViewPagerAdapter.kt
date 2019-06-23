package com.serapbercin.viewpager2example.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.serapbercin.viewpager2example.views.PageAdapter

class CategoryViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    override fun createFragment(position: Int): Fragment {
        return PageAdapter.instance()
    }

    override fun getItemCount(): Int = 2
}