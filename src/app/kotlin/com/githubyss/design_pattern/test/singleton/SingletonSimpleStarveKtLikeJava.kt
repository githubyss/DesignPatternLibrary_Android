package com.githubyss.design_pattern.test.singleton


/**
 * SingletonSimpleStarveKtLikeJava
 *
 * 饿汉式：不做判断，默认就生成了单例的 INSTANCE 对象。
 *
 * - 优点：简单好写。
 * - 缺点：类加载就初始化了 INSTANCE 对象。影响应用启动速度，不能实现延迟加载，不管将来用不用，始终占据内存。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:44:55
 */
class SingletonSimpleStarveKtLikeJava {
    /** 第一步：私有构造 */
    private constructor()

    companion object {
        /** 第二步：私有静态对象 */
        private val INSTANCE = SingletonSimpleStarveKtLikeJava()

        /** 第三步：对外提供获取方法 */
        fun getInstance(): SingletonSimpleStarveKtLikeJava {
            return INSTANCE
        }
    }
}
