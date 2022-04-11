package com.githubyss.design_pattern.test.decorator.finery


class DecoratorFineryByLeatherShoes : DecoratorFineryAbstract() {
    override fun show() {
        print("皮鞋")
        print(" ")
        super.show()
    }
}