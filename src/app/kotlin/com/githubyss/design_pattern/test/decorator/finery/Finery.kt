package com.githubyss.design_pattern.test.decorator.finery


class Finery(var name: String) : IFinery {
    override fun show() {
        println("装扮的$name")
    }
}