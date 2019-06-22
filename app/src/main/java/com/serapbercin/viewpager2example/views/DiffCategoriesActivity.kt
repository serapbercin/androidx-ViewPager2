package com.serapbercin.viewpager2example.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.serapbercin.viewpager2example.R
import com.serapbercin.viewpager2example.adapter.CategoryDiffUtilAdapter
import com.serapbercin.viewpager2example.util.DummyCategoryData.categories
import kotlinx.android.synthetic.main.activity_main.*

class DiffCategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CategoryDiffUtilAdapter()
        viewPager2.adapter = adapter

        adapter.submitList(categories)
    }
}