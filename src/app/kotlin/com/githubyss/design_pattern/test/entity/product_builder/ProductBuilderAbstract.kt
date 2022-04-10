package com.githubyss.design_pattern.test.entity.product_builder


abstract class ProductBuilderAbstract {
    abstract fun addPartA()
    abstract fun addPartB()
    abstract fun create(): Product
}