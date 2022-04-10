package com.githubyss.design_pattern.test.decorator


class DecoratorFineryLeatherShoes : DecoratorFinery() {
    override fun show() {
        print("皮鞋")
        super.show()
    }
}