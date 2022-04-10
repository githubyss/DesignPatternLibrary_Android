package com.githubyss.design_pattern.test.decorator


class DecoratorFineryTShirts : DecoratorFinery() {
    override fun show() {
        print("大T恤")
        super.show()
    }
}