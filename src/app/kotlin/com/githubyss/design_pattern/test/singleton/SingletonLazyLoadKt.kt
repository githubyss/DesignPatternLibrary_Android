package com.githubyss.design_pattern.test.singleton


/**
 * SingletonLazyLoadKt
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:24:15
 */
class SingletonLazyLoadKt private constructor() {
    /** Kotlin 原生写法 */
    companion object {
        /** LazyThreadSafetyMode.NONE 表示线程不安全 */
        val INSTANCE by lazy(LazyThreadSafetyMode.NONE) {
            SingletonLazyLoadKt()
        }
    }

    var TAG: String = SingletonLazyLoadKt::class.java.simpleName
}

class SingletonLazyLoadKtLikeJava private constructor() {
    /** 模仿 Java 写法 */
    companion object {
        private var INSTANCE: SingletonLazyLoadKtLikeJava? = null

        fun getInstance(): SingletonLazyLoadKtLikeJava {
            if (INSTANCE == null) {
                INSTANCE = SingletonLazyLoadKtLikeJava()
            }
            return INSTANCE!!
        }
    }

    var TAG: String = SingletonLazyLoadKtLikeJava::class.java.simpleName
}
