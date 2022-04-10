package com.githubyss.design_pattern.test.decorator


class DecoratorFinerySneaker : DecoratorFinery() {
    override fun show() {
        print("破球鞋")
        super.show()
    }
}