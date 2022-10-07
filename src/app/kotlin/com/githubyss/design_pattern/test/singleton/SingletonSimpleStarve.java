package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonSimpleStarve
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:06:51
 */
class SingletonSimpleStarve {
    /** 第一步：私有构造 */
    private SingletonSimpleStarve() {
    }

    /** 第二步：私有静态对象 */
    private static final SingletonSimpleStarve INSTANCE = new SingletonSimpleStarve();

    /** 第三步：对外提供获取方法 */
    public static SingletonSimpleStarve getInstance() {
        return INSTANCE;
    }
}
