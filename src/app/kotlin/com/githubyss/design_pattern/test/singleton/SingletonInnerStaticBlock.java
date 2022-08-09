package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonInnerStaticBlock
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:14:20
 */
class SingletonInnerStaticBlock {
    /** 第一步：私有构造 */
    private SingletonInnerStaticBlock() {
    }

    /** 第二步：公有静态对象 */
    public static SingletonInnerStaticBlock INSTANCE;

    /** 第三步：静态代码块 */
    static {
        INSTANCE = new SingletonInnerStaticBlock();
    }

    public String TAG = SingletonInnerStaticBlock.class.getSimpleName();
}
