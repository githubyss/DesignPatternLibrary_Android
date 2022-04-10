package com.githubyss.design_pattern.test.decorator


class DecoratorFineryBigTrouser : DecoratorFinery() {
    override fun show() {
        print("大垮裤")
        super.show()
    }
}