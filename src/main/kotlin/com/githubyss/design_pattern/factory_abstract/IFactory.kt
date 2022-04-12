package com.githubyss.design_pattern.factory_abstract


/**
 * IFactory
 * 抽象工厂
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/12 10:27:37
 */
interface IFactory<I> {
    fun <E : I> create(clazz: Any, vararg initArgs: Any = emptyArray()): E
}