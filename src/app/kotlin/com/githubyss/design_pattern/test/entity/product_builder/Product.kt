package com.githubyss.design_pattern.test.entity.product_builder


class Product {
    val parts: ArrayList<String> = ArrayList()

    fun add(part: String) {
        parts.add(part)
    }

    fun show() {
        println("产品创建")
        parts.forEach {
            println(it)
        }
    }
}