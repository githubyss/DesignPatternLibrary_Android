package com.githubyss.design_pattern.test.builder.product_builder


class ProductBuilderConcrete2 : ProductBuilderAbstract() {
    private val product: Product = Product()

    override fun addPartA() {
        product.add("产品2：部件A")
    }

    override fun addPartB() {
        product.add("产品2：部件B")
    }

    override fun create(): Product {
        return product
    }
}