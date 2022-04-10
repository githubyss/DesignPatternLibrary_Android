package com.githubyss.design_pattern.test.decorator


class DecoratorFinerySuit : DecoratorFinery() {
    override fun show() {
        print("西装")
        super.show()
    }
}