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

    println(SingletonStarve.getInstance().TAG)
    println(SingletonStarveKt.getInstance().TAG)

    println(SingletonLazyLoad.getInstance().TAG)
    println(SingletonLazyLoadKt.INSTANCE.TAG)
    println(SingletonLazyLoadKtLikeJava.getInstance().TAG)

    println(SingletonLazySynchronized.getInstance().TAG)
    println(SingletonLazySynchronizedKt.getInstance().TAG)

    println(SingletonDoubleCheck.getInstance().TAG)
    println(SingletonDoubleCheckKt.INSTANCE.TAG)
    println(SingletonDoubleCheckKtLikeJava.getInstance().TAG)

    println(SingletonInnerStaticClass.getInstance().TAG)
    println(SingletonInnerStaticClassKt.getInstance().TAG)

    println(SingletonInnerStaticBlock.INSTANCE.TAG)
    println(SingletonInnerStaticBlockKt.TAG)
}