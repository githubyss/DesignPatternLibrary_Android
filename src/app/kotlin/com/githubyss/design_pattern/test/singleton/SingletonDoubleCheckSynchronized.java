package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonDoubleCheckSynchronized
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:46:29
 */
class SingletonDoubleCheckSynchronized {
    /** 第一步：私有构造 */
    private SingletonDoubleCheckSynchronized() {
    }

    /** 第二步：私有静态对象 */
    private static volatile SingletonDoubleCheckSynchronized INSTANCE;

    /** 第三步：对外提供获取方法 */
    public static SingletonDoubleCheckSynchronized getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleCheckSynchronized.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheckSynchronized();
                }
            }
        }
        return INSTANCE;
    }
}
