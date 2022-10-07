package com.githubyss.design_pattern.test.singleton


/**
 * SingletonDoubleCheckSynchronizedKtLikeJava
 *
 * 模仿 Java 写法
 *
 * 双重检测式：同步锁式基础上，将 synchronized 内移，对二次判空方法体加锁。
 *
 * - 优点：第一次获取的时候才会加锁。
 * - 缺点：写法比较繁琐，需要用到 volatile、synchronized 等关键字。线程安全控制烦琐，而且性能受影响。
 *
 * 先对 INSTANCE 判空，空的话就对 类.class 加锁，锁内再对 INSTANCE 判空，空的话就创建。
 *
 * volatile 是 Java 虚拟机提供的轻量级同步机制，禁止指令重排（保证有序性），从而避免了多线程环境下程序出现乱序执行的现象。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/06 16:53:29
 */
class SingletonDoubleCheckSynchronizedKtLikeJava {
    /** 第一步：私有构造 */
    private constructor()

    companion object {
        /** 第二步：私有静态对象 */
        @Volatile
        private var INSTANCE: SingletonDoubleCheckSynchronizedKtLikeJava? = null

        /** 第三步：对外提供获取方法 */
        fun getInstance(): SingletonDoubleCheckSynchronizedKtLikeJava {
            if (INSTANCE == null) {
                synchronized(SingletonDoubleCheckSynchronizedKtLikeJava::class) {
                    if (INSTANCE == null) {
                        INSTANCE = SingletonDoubleCheckSynchronizedKtLikeJava()
                    }
                }
            }
            return INSTANCE!!
        }
    }
}
