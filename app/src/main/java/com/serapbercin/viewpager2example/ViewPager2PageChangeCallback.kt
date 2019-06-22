package com.serapbercin.viewpager2example

import androidx.viewpager2.widget.ViewPager2

class ViewPager2PageChangeCallback(private val listener: (Int) -> Unit) :
        ViewPager2.OnPageChangeCallback() {

    override fun onPageSelected(position: Int) {
        super.onPageSelected(position)
        when (position) {
            0 -> listener.invoke(5)
            6 -> listener.invoke(1)
        }
    }

}