package com.serapbercin.viewpager2example

import android.R
import android.app.ListActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.ListView
import android.widget.SimpleAdapter
import com.serapbercin.viewpager2example.views.*
import com.serapbercin.viewpager2example.views.CategoryActivity.Companion.ORIENTATION_HORIZONTAL
import com.serapbercin.viewpager2example.views.CategoryActivity.Companion.ORIENTATION_VERTICAL

const val ORIENTATION_TYPE = "ORIENTATION_TYPE"

class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listAdapter = SimpleAdapter(
            this, getData(),
            R.layout.simple_list_item_1, arrayOf("title"),
            intArrayOf(R.id.text1)
        )
    }

    private fun getData(): List<Map<String, Any>> {
        val data = mutableListOf<Map<String, Any>>()

        data.add(
            mapOf(
                "title" to "HORIZONTAL ViewPager2",
                "intent" to activityToIntent(
                    CategoryActivity::class.java.name
                )
            )
        )
        data.add(
            mapOf(
                "title" to "VERTICAL ViewPager2",
                "intent" to activityToIntent(
                    CategoryActivity::class.java.name,
                    ORIENTATION_VERTICAL
                )
            )
        )

        data.add(
            mapOf(
                "title" to "Show Multiple Pages In ViewPager2",
                "intent" to activityToIntent(
                    MultipleCategoriesPageActivity::class.java.name
                )
            )
        )

        data.add(
            mapOf(
                "title" to "PageTransformer In ViewPager2",
                "intent" to activityToIntent(
                    PageTransformerCategoryActivity::class.java.name
                )
            )
        )

        data.add(
            mapOf(
                "title" to "Endless Scroll Page In ViewPager2",
                "intent" to activityToIntent(
                    InfinitiveCategoryPageActivity::class.java.name
                )
            )
        )

        data.add(
            mapOf(
                "title" to "Diff Util Using In ViewPager2",
                "intent" to activityToIntent(
                    DiffCategoriesActivity::class.java.name
                )
            )
        )



        data.add(
            mapOf(
                "title" to "Fragment State Adapter In ViewPager2",
                "intent" to activityToIntent(
                    CategoryFragmentActivity::class.java.name
                )
            )
        )
        return data
    }

    private fun activityToIntent(
        activity: String,
        orientation: String = ORIENTATION_HORIZONTAL
    ): Intent =
        Intent(Intent.ACTION_VIEW).setClassName(
            this.packageName,
            activity
        ).putExtra(ORIENTATION_TYPE, orientation)

    override fun onListItemClick(listView: ListView, view: View, position: Int, id: Long) {
        val map = listView.getItemAtPosition(position) as Map<*, *>
        val intent = Intent(map["intent"] as Intent)
        intent.addCategory(Intent.CATEGORY_SAMPLE_CODE)
        startActivity(intent)
    }
}
