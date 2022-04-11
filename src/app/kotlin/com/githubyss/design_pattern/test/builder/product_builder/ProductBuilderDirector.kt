package com.githubyss.design_pattern.test.builder.product_builder

import com.githubyss.design_pattern.test.builder.product_builder.Product
import com.githubyss.design_pattern.test.builder.product_builder.ProductBuilderAbstract


class ProductBuilderDirector {
    fun build(builder: ProductBuilderAbstract): Product {
        builder.addPartA()
        builder.addPartB()
        return builder.create()
    }
}