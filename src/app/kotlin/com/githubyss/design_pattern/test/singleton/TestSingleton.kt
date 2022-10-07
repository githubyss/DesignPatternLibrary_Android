package com.githubyss.design_pattern.test.singleton

import com.githubyss.design_pattern.test.PREFIX


/**
 * TestSingleton
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 21:01:47
 */

fun singleton() {
    println("$PREFIX Singleton 工厂方法模式（普通实现）")
    println()

    println(SingletonSimpleStarve.getInstance())
    println(SingletonSimpleStarveKotlinBytecode.getInstance())
    println(SingletonSimpleStarveKt)
    println(SingletonSimpleStarveKtLikeJava.getInstance())

    println(SingletonSingleCheckLazyLoad.getInstance())
    println(SingletonSingleCheckLazyLoadKt.getInstance())
    println(SingletonSingleCheckLazyLoadKtLikeJava.getInstance())

    println(SingletonSingleCheckSynchronizedLazySynchronized.getInstance())
    println(SingletonSingleCheckSynchronizedLazySynchronizedKt.getInstance())

    println(SingletonDoubleCheckSynchronized.getInstance())
    println(SingletonDoubleCheckSynchronizedKt.getInstance())
    println(SingletonDoubleCheckSynchronizedKtLikeJava.getInstance())

    println(SingletonStaticInnerClass.getInstance())
    println(SingletonStaticInnerClassKt.getInstance())

    println()
}