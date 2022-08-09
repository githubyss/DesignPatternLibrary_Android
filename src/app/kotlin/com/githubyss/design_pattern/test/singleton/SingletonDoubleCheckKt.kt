package com.githubyss.design_pattern.test.singleton


/**
 * SingletonDoubleCheckKt
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:53:10
 */
class SingletonDoubleCheckKt private constructor() {
    companion object {
        /** Kotlin 原生写法 */
        /** LazyThreadSafetyMode.SYNCHRONIZED 表示线程安全 */
        val INSTANCE by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonDoubleCheckKt()
        }
    }

    var TAG: String = SingletonDoubleCheckKt::class.java.simpleName
}

class SingletonDoubleCheckKtLikeJava private constructor() {
    companion object {
        /** 模仿 Java 写法 */
        @Volatile
        private var INSTANCE: SingletonDoubleCheckKtLikeJava? = null

        fun getInstance(): SingletonDoubleCheckKtLikeJava {
            if (INSTANCE == null) {
                synchronized(SingletonDoubleCheckKtLikeJava::class) {
                    if (INSTANCE == null) {
                        INSTANCE = SingletonDoubleCheckKtLikeJava()
                    }
                }
            }
            return INSTANCE!!
        }
    }

    var TAG: String = SingletonDoubleCheckKtLikeJava::class.java.simpleName
}
