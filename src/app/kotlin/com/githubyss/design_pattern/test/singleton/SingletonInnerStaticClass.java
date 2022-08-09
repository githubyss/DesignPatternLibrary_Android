package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonInnerStaticClass
 *
 * 内部类式：满足了懒加载、线程安全，代码也非常少
 * - 优点：简单，代码少
 * - 缺点：暂无
 *
 * 应用初始化时，没有调用 getInstance()，就没有创建 INSTANCE，满足懒汉式。
 * 当 SingletonInnerStaticClass 类加载时，静态内部类 Holder 没有被加载进内存。
 * 只有调用 getInstance() 的时候，触发 Holder.INSTANCE 时 Holder 才会被加载，此时初始化 INSTANCE 对象。
 * Jvm 为保证类加载的安全性，会保证静态内部类的成员变量只会初始化一次，所以 INSTANCE 只会实例化一次，保证线程安全。
 *
 * getInstance() 内部没有任何线程锁定，所以性能不会有影响。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:58:14
 */
class SingletonInnerStaticClass {
    /** 第一步：私有构造 */
    private SingletonInnerStaticClass() {
    }

    /** 第二步：对外提供获取方法 */
    public static SingletonInnerStaticClass getInstance() {
        return Holder.INSTANCE;
    }

    /** 第三步：静态内部类 */
    private static class Holder {
        private static final SingletonInnerStaticClass INSTANCE = new SingletonInnerStaticClass();
    }

    public String TAG = SingletonInnerStaticClass.class.getSimpleName();
}
