package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonLazySynchronized
 *
 * 同步锁式：懒汉式基础上，加一个关键字 synchronized
 * - 优点：保证线程安全
 * - 缺点：每次获取 INSTANCE 都要加锁，获取的时候不经济
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:31:27
 */
class SingletonLazySynchronized {
    /** 第一步：私有构造 */
    private SingletonLazySynchronized() {
    }

    /** 第二步：私有静态对象 */
    private static SingletonLazySynchronized INSTANCE;

    /** 第三步：对外提供获取方法 */
    public static synchronized SingletonLazySynchronized getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazySynchronized();
        }
        return INSTANCE;
    }

    public String TAG = SingletonLazySynchronized.class.getSimpleName();
}
