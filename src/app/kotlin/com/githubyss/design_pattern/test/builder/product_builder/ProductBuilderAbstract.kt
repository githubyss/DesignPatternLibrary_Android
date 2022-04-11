package com.githubyss.design_pattern.test.builder.product_builder


abstract class ProductBuilderAbstract {
    abstract fun addPartA()
    abstract fun addPartB()
    abstract fun create(): Product
}