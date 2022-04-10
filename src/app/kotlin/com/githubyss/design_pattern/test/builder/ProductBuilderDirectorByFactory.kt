package com.githubyss.design_pattern.test.builder

import com.githubyss.design_pattern.factory_abstract.FactoryConcreteInline
import com.githubyss.design_pattern.test.entity.product_builder.Product
import com.githubyss.design_pattern.test.entity.product_builder.ProductBuilderAbstract


object ProductBuilderDirectorByFactory {
    inline fun <reified B : ProductBuilderAbstract> build(): Product? {
        val factory: FactoryConcreteInline<B> = FactoryConcreteInline<B>()
        val builder: ProductBuilderAbstract? = factory.create<B>()
        builder?.let {
            builder.addPartA()
            builder.addPartB()
        }
        return builder?.create()
    }
}