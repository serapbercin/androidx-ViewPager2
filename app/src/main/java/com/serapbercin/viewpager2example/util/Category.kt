package com.serapbercin.viewpager2example.util

class Category(var id: Int, var name: String) {

    override fun equals(obj: Any?): Boolean {
        if (this === obj) return true
        if (obj == null || javaClass != obj.javaClass) return false
        val category = obj as Category
        if (id != category.id) return false
        return name == category.name

    }

    override fun hashCode(): Int {
        var result = id
        result += name.hashCode()
        return result
    }
}