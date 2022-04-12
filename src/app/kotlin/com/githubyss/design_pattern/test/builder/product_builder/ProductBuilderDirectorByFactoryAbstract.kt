package com.githubyss.design_pattern.test.builder.product_builder

import com.githubyss.design_pattern.factory_abstract.FactoryConcreteInline


object ProductBuilderDirectorByFactoryAbstract {
    inline fun <reified B : ProductBuilderAbstract> build(): Product? {
        val factory: FactoryConcreteInline<ProductBuilderAbstract> = FactoryConcreteInline<ProductBuilderAbstract>()
        val builder: ProductBuilderAbstract = factory.create<B>()
        builder.addPartA()
        builder.addPartB()
        return builder.create()
    }
}