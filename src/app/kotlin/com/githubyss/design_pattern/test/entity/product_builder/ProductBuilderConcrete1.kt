package com.githubyss.design_pattern.test.entity.product_builder


class ProductBuilderConcrete1 : ProductBuilderAbstract() {
    private val product: Product = Product()

    override fun addPartA() {
        product.add("产品1：部件A")
    }

    override fun addPartB() {
        product.add("产品1：部件B")
    }

    override fun create(): Product {
        return product
    }
}