package com.githubyss.design_pattern.test.builder.person_builder


abstract class PersonBuilderAbstract(protected val canvas: DrawCanvas, protected val paint: DrawPaint) {
    abstract fun addHead()
    abstract fun addBody()
    abstract fun addArmLeft()
    abstract fun addArmRight()
    abstract fun addLegLeft()
    abstract fun addLegRight()
}