package com.githubyss.design_pattern.test.builder.person_builder

import com.githubyss.design_pattern.factory.FactoryReflect
import com.githubyss.design_pattern.factory.FactoryReflectInline
import com.githubyss.design_pattern.factory.IFactoryReflect


object PersonBuilderDirectorWithFactoryMethod {
    inline fun <reified B : PersonBuilderAbstract> buildByJClassInline(canvas: DrawCanvas, paint: DrawPaint) {
        val factory: FactoryReflectInline<PersonBuilderAbstract> = FactoryReflectInline<PersonBuilderAbstract>()
        val builder: PersonBuilderAbstract = factory.create<B>(canvas, paint)
        builder.addHead()
        builder.addBody()
        builder.addArmLeft()
        builder.addArmRight()
        builder.addLegLeft()
        builder.addLegRight()
    }

    inline fun <reified B : PersonBuilderAbstract> buildByKClassInline(canvas: DrawCanvas, paint: DrawPaint) {
        val factory: FactoryReflectInline<PersonBuilderAbstract> = FactoryReflectInline<PersonBuilderAbstract>()
        val builder: PersonBuilderAbstract = factory.create<B>(canvas, paint, byKClass = true)
        builder.addHead()
        builder.addBody()
        builder.addArmLeft()
        builder.addArmRight()
        builder.addLegLeft()
        builder.addLegRight()
    }

    inline fun <reified B : PersonBuilderAbstract> buildByJClass(canvas: DrawCanvas, paint: DrawPaint) {
        val factory: IFactoryReflect<PersonBuilderAbstract> = FactoryReflect<PersonBuilderAbstract>()
        val builder: PersonBuilderAbstract = factory.create<B>(B::class.java, canvas, paint)
        builder.addHead()
        builder.addBody()
        builder.addArmLeft()
        builder.addArmRight()
        builder.addLegLeft()
        builder.addLegRight()
    }

    inline fun <reified B : PersonBuilderAbstract> buildByKClass(canvas: DrawCanvas, paint: DrawPaint) {
        val factory: IFactoryReflect<PersonBuilderAbstract> = FactoryReflect<PersonBuilderAbstract>()
        val builder: PersonBuilderAbstract = factory.create<B>(B::class, canvas, paint)
        builder.addHead()
        builder.addBody()
        builder.addArmLeft()
        builder.addArmRight()
        builder.addLegLeft()
        builder.addLegRight()
    }
}