package com.serapbercin.viewpager2example.transformer

import android.view.View
import androidx.viewpager2.widget.ViewPager2

class ViewPager2PageTransformation : ViewPager2.PageTransformer {

    override fun transformPage(page: View, position: Float) {

        when {
            position < -1 ->
                page.alpha = 0f
            position <= 1 -> {
                page.alpha = Math.max(0.2f, 1 - Math.abs(position))
            }
            else -> page.alpha = 0f
        }
    }
}