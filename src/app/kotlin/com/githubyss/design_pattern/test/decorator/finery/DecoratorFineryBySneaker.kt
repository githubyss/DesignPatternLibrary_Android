package com.githubyss.design_pattern.test.decorator.finery


class DecoratorFineryBySneaker : DecoratorFineryAbstract() {
    override fun show() {
        print("破球鞋")
        print(" ")
        super.show()
    }
}