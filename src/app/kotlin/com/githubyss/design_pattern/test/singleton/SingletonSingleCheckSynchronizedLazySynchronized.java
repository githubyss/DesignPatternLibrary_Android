package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonSingleCheckSynchronizedLazySynchronized
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:31:27
 */
class SingletonSingleCheckSynchronizedLazySynchronized {
    /** 第一步：私有构造 */
    private SingletonSingleCheckSynchronizedLazySynchronized() {
    }

    /** 第二步：私有静态对象 */
    private static SingletonSingleCheckSynchronizedLazySynchronized INSTANCE;

    /** 第三步：对外提供获取方法 */
    public static synchronized SingletonSingleCheckSynchronizedLazySynchronized getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonSingleCheckSynchronizedLazySynchronized();
        }
        return INSTANCE;
    }
}
