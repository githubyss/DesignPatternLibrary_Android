package com.githubyss.design_pattern.test.builder

import com.githubyss.design_pattern.factory_abstract.FactoryAbstract
import com.githubyss.design_pattern.factory_abstract.FactoryConcrete
import com.githubyss.design_pattern.factory_abstract.FactoryConcreteInline
import com.githubyss.design_pattern.test.entity.person_builder.PersonBuilderAbstract
import com.githubyss.design_pattern.test.entity.person_builder.draw.DrawCanvas
import com.githubyss.design_pattern.test.entity.person_builder.draw.DrawPaint


object PersonBuilderDirectorByFactory {
    inline fun <reified B : PersonBuilderAbstract> buildByJClassInline(canvas: DrawCanvas, paint: DrawPaint) {
        val factory: FactoryConcreteInline<B> = FactoryConcreteInline<B>()
        val builder: PersonBuilderAbstract? = factory.create<B>(initArgs = arrayOf(canvas, paint))
        builder?.let {
            builder.addHead()
            builder.addBody()
            builder.addArmLeft()
            builder.addArmRight()
            builder.addLegLeft()
            builder.addLegRight()
        }
    }

    inline fun <reified B : PersonBuilderAbstract> buildByKClassInline(canvas: DrawCanvas, paint: DrawPaint) {
        val factory: FactoryConcreteInline<B> = FactoryConcreteInline<B>()
        val builder: PersonBuilderAbstract? = factory.create<B>(true, canvas, paint)
        builder?.let {
            builder.addHead()
            builder.addBody()
            builder.addArmLeft()
            builder.addArmRight()
            builder.addLegLeft()
            builder.addLegRight()
        }
    }

    inline fun <reified B : PersonBuilderAbstract> buildByJClass(canvas: DrawCanvas, paint: DrawPaint) {
        val factory: FactoryAbstract<B> = FactoryConcrete<B>()
        val builder: PersonBuilderAbstract? = factory.create<B>(B::class.java, canvas, paint)
        builder?.let {
            builder.addHead()
            builder.addBody()
            builder.addArmLeft()
            builder.addArmRight()
            builder.addLegLeft()
            builder.addLegRight()
        }
    }

    inline fun <reified B : PersonBuilderAbstract> buildByKClass(canvas: DrawCanvas, paint: DrawPaint) {
        val factory: FactoryAbstract<B> = FactoryConcrete<B>()
        val builder: PersonBuilderAbstract? = factory.create<B>(B::class, canvas, paint)
        builder?.let {
            builder.addHead()
            builder.addBody()
            builder.addArmLeft()
            builder.addArmRight()
            builder.addLegLeft()
            builder.addLegRight()
        }
    }
}