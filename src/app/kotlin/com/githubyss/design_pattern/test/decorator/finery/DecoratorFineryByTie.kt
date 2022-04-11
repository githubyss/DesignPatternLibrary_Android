package com.githubyss.design_pattern.test.decorator.finery


class DecoratorFineryByTie : DecoratorFineryAbstract() {
    override fun show() {
        print("领带")
        print(" ")
        super.show()
    }
}