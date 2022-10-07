package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonSingleCheckLazyLoad
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:19:11
 */
class SingletonSingleCheckLazyLoad {
    /** 第一步：私有构造 */
    private SingletonSingleCheckLazyLoad() {
    }

    /** 第二步：私有静态对象 */
    private static SingletonSingleCheckLazyLoad INSTANCE;

    /** 第三步：对外提供获取方法 */
    public static SingletonSingleCheckLazyLoad getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonSingleCheckLazyLoad();
        }
        return INSTANCE;
    }
}
