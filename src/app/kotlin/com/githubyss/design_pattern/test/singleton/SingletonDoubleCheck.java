package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonDoubleCheck
 *
 * 双重检测式：先对 INSTANCE 判空，空的话就对 类.class 加锁，锁内再对 INSTANCE 判空，空的话就创建
 * - 优点：第一次获取的时候才会加锁
 * - 缺点：写法比较繁琐，需要用到 volatile、synchronized 等关键字。线程安全控制烦琐，而且性能受影响
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:46:29
 */
class SingletonDoubleCheck {
    /** 第一步：私有构造 */
    private SingletonDoubleCheck() {
    }

    /** 第二步：私有静态对象 */
    private static volatile SingletonDoubleCheck INSTANCE;

    /** 第三步：对外提供获取方法 */
    public static SingletonDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    public String TAG = SingletonDoubleCheck.class.getSimpleName();
}
