package com.githubyss.design_pattern.test.entity.person_builder

import com.githubyss.design_pattern.test.entity.person_builder.draw.DrawCanvas
import com.githubyss.design_pattern.test.entity.person_builder.draw.DrawPaint


abstract class PersonBuilderAbstract(protected val canvas: DrawCanvas, protected val paint: DrawPaint) {
    abstract fun addHead()
    abstract fun addBody()
    abstract fun addArmLeft()
    abstract fun addArmRight()
    abstract fun addLegLeft()
    abstract fun addLegRight()
}