package com.githubyss.design_pattern.test.decorator

import com.githubyss.design_pattern.test.entity.person.Person


open class DecoratorFinery : Person() {
    private var person: Person? = null

    override fun show() {
        person?.show()
    }

    fun decorator(person: Person): Person {
        this.person = person
        return person
    }
}