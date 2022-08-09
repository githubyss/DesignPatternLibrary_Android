package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonLazyLoad
 *
 * 懒汉式：饿汉式基础上，加了一个对 INSTANCE 的判空逻辑
 * - 优点：只有第一次使用时，才会初始化 INSTANCE 对象
 * - 缺点：线程非安全，多线程中可能会创建多个 INSTANCE 对象
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:19:11
 */
class SingletonLazyLoad {
    /** 第一步：私有构造 */
    private SingletonLazyLoad() {
    }

    /** 第二步：私有静态对象 */
    private static SingletonLazyLoad INSTANCE;

    /** 第三步：对外提供获取方法 */
    public static SingletonLazyLoad getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazyLoad();
        }
        return INSTANCE;
    }

    public String TAG = SingletonLazyLoad.class.getSimpleName();
}
