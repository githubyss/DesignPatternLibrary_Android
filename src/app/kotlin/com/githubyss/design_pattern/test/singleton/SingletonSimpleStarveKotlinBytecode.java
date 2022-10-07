package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonSimpleStarveKotlinBytecode
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/10/07 18:06:41
 */
class SingletonSimpleStarveKotlinBytecode {
    /** 第一步：私有构造 */
    private SingletonSimpleStarveKotlinBytecode() {
    }

    /** 第二步：私有静态对象 */
    private static final SingletonSimpleStarveKotlinBytecode INSTANCE;

    /** 第二步补充：静态代码块 */
    static {
        SingletonSimpleStarveKotlinBytecode var0 = new SingletonSimpleStarveKotlinBytecode();
        INSTANCE = var0;
    }

    /** 第三步：对外提供静态对象 */
    public static SingletonSimpleStarveKotlinBytecode getInstance() {
        return INSTANCE;
    }

}
