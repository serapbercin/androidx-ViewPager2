package com.serapbercin.viewpager2example.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.serapbercin.viewpager2example.R
import com.serapbercin.viewpager2example.adapter.CategoryAdapter
import com.serapbercin.viewpager2example.transformer.ViewPager2PageTransformation
import com.serapbercin.viewpager2example.util.DummyCategoryData.categories
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class PageTransformerCategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CategoryAdapter()
        viewPager2.adapter = adapter
        adapter.setItem(categories)
        with(viewPager2) {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
        }

        viewPager2.setPageTransformer(ViewPager2PageTransformation())
    }
}