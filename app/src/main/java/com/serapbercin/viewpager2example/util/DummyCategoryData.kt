package com.serapbercin.viewpager2example.util

object DummyCategoryData {
    val categories: List<Category>
        get() {
            val categories = mutableListOf<Category>()
            return categories.apply {
                add(Category(1, "Your Recording"))
                add(Category(2, "Film"))
                add(Category(3, "Series"))
                add(Category(4, "Kids"))
                add(Category(5, "Sport"))
                add(Category(6, "Information"))
                add(Category(7, "Planned"))
                add(Category(8, "All"))
            }
        }
}