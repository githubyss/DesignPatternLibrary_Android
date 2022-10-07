package com.githubyss.design_pattern.test.singleton


/**
 * SingletonDoubleCheckSynchronizedKt
 *
 * Kotlin 原生写法
 * 使用 LazyThreadSafetyMode.SYNCHRONIZED 进行双重检测。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:53:10
 */
class SingletonDoubleCheckSynchronizedKt {
    /** 第一步：私有构造 */
    private constructor()

    companion object {
        /** 第二步：私有静态对象 */
        private val INSTANCE: SingletonDoubleCheckSynchronizedKt by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            /** LazyThreadSafetyMode.SYNCHRONIZED 表示线程安全 */
            SingletonDoubleCheckSynchronizedKt()
        }

        /** 第三步：对外提供获取方法 */
        fun getInstance(): SingletonDoubleCheckSynchronizedKt {
            return INSTANCE
        }
    }
}
