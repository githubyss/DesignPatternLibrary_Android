package com.githubyss.design_pattern.test.builder.person_builder

import com.githubyss.design_pattern.test.builder.person_builder.PersonBuilderAbstract


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