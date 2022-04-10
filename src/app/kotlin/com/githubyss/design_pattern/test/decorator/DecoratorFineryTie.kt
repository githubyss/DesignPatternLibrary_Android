package com.githubyss.design_pattern.test.decorator


class DecoratorFineryTie : DecoratorFinery() {
    override fun show() {
        print("领带")
        super.show()
    }
}