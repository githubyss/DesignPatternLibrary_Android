package com.githubyss.design_pattern.test.builder

import com.githubyss.design_pattern.test.entity.person_builder.PersonBuilderAbstract


class PersonBuilderDirector(private val builder: PersonBuilderAbstract) {
    fun build() {
        builder.addHead()
        builder.addBody()
        builder.addArmLeft()
        builder.addArmRight()
        builder.addLegLeft()
        builder.addLegRight()
    }
}