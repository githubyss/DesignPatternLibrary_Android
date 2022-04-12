package com.githubyss.design_pattern.test.builder.product_builder

import com.githubyss.design_pattern.factory.FactoryReflectInline


object ProductBuilderDirectorByFactoryAbstract {
    inline fun <reified B : ProductBuilderAbstract> build(): Product? {
        val factory: FactoryReflectInline<ProductBuilderAbstract> = FactoryReflectInline<ProductBuilderAbstract>()
        val builder: ProductBuilderAbstract = factory.create<B>()
        builder.addPartA()
        builder.addPartB()
        return builder.create()
    }
}