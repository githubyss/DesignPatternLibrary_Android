package com.githubyss.design_pattern.test.singleton;


/**
 * SingletonStarve
 *
 * 饿汉式：不做判断，默认就生成了单例的 INSTANCE 对象
 * - 优点：简单好写
 * - 缺点：类加载就初始化了 INSTANCE 对象。影响应用启动速度，不能实现延迟加载，不管将来用不用，始终占据内存。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:06:51
 */
class SingletonStarve {
    /** 第一步：私有构造 */
    private SingletonStarve() {
    }

    /** 第二步：私有静态对象 */
    private static final SingletonStarve INSTANCE = new SingletonStarve();

    /** 第三步：对外提供获取方法 */
    public static SingletonStarve getInstance() {
        return INSTANCE;
    }

    public String TAG = SingletonStarve.class.getSimpleName();
}
