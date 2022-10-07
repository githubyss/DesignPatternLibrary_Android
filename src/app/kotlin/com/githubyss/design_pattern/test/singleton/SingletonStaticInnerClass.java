package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonStaticInnerClass
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:58:14
 */
class SingletonStaticInnerClass {
    /** 第一步：私有构造 */
    private SingletonStaticInnerClass() {
    }

    /** 第二步：私有静态内部类 */
    private static class Holder {
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    /** 第三步：对外提供获取方法 */
    public static SingletonStaticInnerClass getInstance() {
        return Holder.INSTANCE;
    }
}
