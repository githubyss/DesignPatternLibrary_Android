package com.githubyss.design_pattern.test.singleton


/**
 * SingletonInnerStaticClassKt
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 22:16:35
 */
class SingletonInnerStaticClassKt private constructor() {
    companion object {
        fun getInstance() = Holder.INSTANCE
    }

    private object Holder {
        val INSTANCE = SingletonInnerStaticClassKt()
    }

    var TAG: String = SingletonInnerStaticClassKt::class.java.simpleName
}
