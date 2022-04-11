package com.githubyss.design_pattern.test.decorator.finery


abstract class DecoratorFineryAbstract : IFinery {
    private var finery: IFinery? = null

    override fun show() {
        finery?.show()
    }

    fun decorator(finery: IFinery) {
        this.finery = finery
    }
}