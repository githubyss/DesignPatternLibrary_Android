package com.githubyss.design_pattern.singleton


/**
 * SingletonHolder1Arg
 * 单参数的单例模式封装
 * 把创建和初始化带单参数的单例的逻辑封装起来。并通过双重检查锁定算法实现逻辑的线程安全。
 *
 * 创建单例：
 * class SomeSingleton private constructor(context: Context) {
 *      companion object : SingletonHolder1Arg<SomeSingleton, Context>(::SomeSingleton)
 *
 *      init {
 *          // Init using context argument
 *          context.getString(R.string.app_name)
 *      }
 * }
 *
 * 使用单例：
 * SomeSingleton.getInstance(context)
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2021/02/22 10:29:55
 */
open class SingletonHolder1Arg<out S, in C>(creator: (C) -> S) {
    private var creator: ((C) -> S)? = creator

    @Volatile
    private var instance: S? = null

    fun getInstance(arg: C): S {
        val i = instance
        if (i != null) {
            return i
        }

        return synchronized(this) {
            val i2 = instance
            if (i2 != null) {
                i2
            }
            else {
                val created = creator!!(arg)
                instance = created
                creator = null
                created
            }
        }
    }

    // 对上述方法的一种更简洁的写法
    fun getInstance2(arg: C): S = instance ?: synchronized(this) {
        instance ?: creator!!(arg).apply {
            instance = this
        }
    }

    // lazy写法
    fun getInstance3(arg: C): S {
        val instance: S by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            creator!!(arg)
        }
        return instance
    }
}
