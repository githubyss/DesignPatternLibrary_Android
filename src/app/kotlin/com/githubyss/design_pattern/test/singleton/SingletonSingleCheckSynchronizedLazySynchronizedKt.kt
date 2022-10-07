package com.githubyss.design_pattern.test.singleton


/**
 * SingletonSingleCheckSynchronizedLazySynchronizedKt
 *
 * 同步锁式：懒汉式基础上，加一个关键字 synchronized，对 getInstance() 加锁。
 *
 * - 优点：保证线程安全。
 * - 缺点：每次获取 INSTANCE 都要加锁，获取的时候不经济。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:39:12
 */
class SingletonSingleCheckSynchronizedLazySynchronizedKt {
    /** 第一步：私有构造 */
    private constructor()

    companion object {
        /** 第二步：私有静态对象 */
        private var INSTANCE: SingletonSingleCheckSynchronizedLazySynchronizedKt? = null

        /** 第三步：对外提供获取方法 */
        @Synchronized
        fun getInstance(): SingletonSingleCheckSynchronizedLazySynchronizedKt {
            if (INSTANCE == null) {
                INSTANCE = SingletonSingleCheckSynchronizedLazySynchronizedKt()
            }
            return INSTANCE!!
        }
    }
}
