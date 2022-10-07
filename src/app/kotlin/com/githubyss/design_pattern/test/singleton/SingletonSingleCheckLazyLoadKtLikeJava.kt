package com.githubyss.design_pattern.test.singleton


/**
 * SingletonSingleCheckLazyLoadKtLikeJava
 *
 * 模仿 Java 写法
 *
 * 懒汉式：饿汉式基础上，加了一个对 INSTANCE 的判空逻辑。
 *
 * - 优点：只有第一次使用时，才会初始化 INSTANCE 对象。
 * - 缺点：线程非安全，多线程中可能会创建多个 INSTANCE 对象。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/06 17:18:03
 */
class SingletonSingleCheckLazyLoadKtLikeJava {
    /** 第一步：私有构造 */
    private constructor()

    companion object {
        /** 第二步：私有静态对象 */
        private var INSTANCE: SingletonSingleCheckLazyLoadKtLikeJava? = null

        /** 第三步：对外提供获取方法 */
        fun getInstance(): SingletonSingleCheckLazyLoadKtLikeJava {
            if (INSTANCE == null) {
                INSTANCE = SingletonSingleCheckLazyLoadKtLikeJava()
            }
            return INSTANCE!!
        }
    }
}
