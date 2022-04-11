package com.githubyss.design_pattern.test.decorator.finery


class DecoratorFineryBySuit : DecoratorFineryAbstract() {
    override fun show() {
        print("西装")
        print(" ")
        super.show()
    }
}