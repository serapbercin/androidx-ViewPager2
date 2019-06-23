package com.serapbercin.viewpager2example.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.serapbercin.viewpager2example.R
import com.serapbercin.viewpager2example.adapter.CategoryAdapter
import com.serapbercin.viewpager2example.transformer.ViewPager2PageTransformation
import kotlinx.android.synthetic.main.activity_main.*

class PageTransformerCategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: MutableList<String> = mutableListOf()

        list.add("Zero Category")
        list.add("First Category")
        list.add("Second Category")
        list.add("Third Category")
        list.add("Fourth Category")

        val adapter = CategoryAdapter()
        viewPager2.adapter = adapter
        adapter.setItem(list)
        with(viewPager2) {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
            setPadding(90, 0, 90, 0)
        }

        viewPager2.setPageTransformer(ViewPager2PageTransformation())
    }
}