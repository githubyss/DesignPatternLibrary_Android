package com.githubyss.design_pattern.test.singleton


/**
 * SingletonStarveKt
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:44:55
 */
class SingletonStarveKt private constructor() {
    companion object {
        private val INSTANCE = SingletonStarveKt()
        fun getInstance(): SingletonStarveKt {
            return INSTANCE
        }
    }

    var TAG: String = SingletonStarveKt::class.java.simpleName
}
