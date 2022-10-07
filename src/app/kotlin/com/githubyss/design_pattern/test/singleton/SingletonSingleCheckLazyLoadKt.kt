package com.githubyss.design_pattern.test.singleton


/**
 * SingletonSingleCheckLazyLoadKt
 *
 * Kotlin 原生写法
 * 使用 LazyThreadSafetyMode.NONE 进行单重检测。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:24:15
 */
class SingletonSingleCheckLazyLoadKt {
    /** 第一步：私有构造 */
    private constructor()

    companion object {
        /** 第二步：私有静态对象 */
        private val INSTANCE: SingletonSingleCheckLazyLoadKt by lazy(LazyThreadSafetyMode.NONE) {
            /** LazyThreadSafetyMode.NONE 表示线程不安全 */
            SingletonSingleCheckLazyLoadKt()
        }

        /** 第三步：对外提供获取方法 */
        fun getInstance(): SingletonSingleCheckLazyLoadKt {
            return INSTANCE
        }
    }
}
