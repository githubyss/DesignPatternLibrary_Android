package com.githubyss.design_pattern.test.decorator.finery


class DecoratorFineryByTShirts : DecoratorFineryAbstract() {
    override fun show() {
        print("大T恤")
        print(" ")
        super.show()
    }
}