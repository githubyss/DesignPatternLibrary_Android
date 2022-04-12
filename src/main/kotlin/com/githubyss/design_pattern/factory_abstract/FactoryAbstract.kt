package com.githubyss.design_pattern.factory_abstract


/**
 * FactoryAbstract
 * 抽象工厂
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/03/09 14:21:54
 */
abstract class FactoryAbstract<I> : IFactory<I> {
    abstract override fun <E : I> create(clazz: Any, vararg initArgs: Any): E
}