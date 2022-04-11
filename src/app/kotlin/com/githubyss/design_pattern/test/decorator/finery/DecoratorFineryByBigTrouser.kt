package com.githubyss.design_pattern.test.decorator.finery


class DecoratorFineryByBigTrouser : DecoratorFineryAbstract() {
    override fun show() {
        print("大垮裤")
        print(" ")
        super.show()
    }
}