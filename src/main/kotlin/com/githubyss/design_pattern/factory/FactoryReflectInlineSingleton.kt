package com.githubyss.design_pattern.factory

import java.lang.reflect.Constructor
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.createInstance


/**
 * FactoryReflectInlineSingleton
 *
 * 通过反射构建具体工厂。
 * Inline 函数实现，可以根据传入的泛型，确定待创建的具体类的 Class 实例。
 *
 * 设计模式对应工厂方法模式，因为是根据具体类构建具体对象，没有条件判断。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/08/01 18:06:19
 */
object FactoryReflectInlineSingleton {
    private val TAG = FactoryReflectInlineSingleton::class.java.simpleName

    inline fun <reified E> createByJClass(vararg initArgs: Any = emptyArray()) = create<E>(*initArgs, false)
    inline fun <reified E> createByKClass(vararg initArgs: Any = emptyArray()) = create<E>(*initArgs, true)

    /**
     * 构建实例
     *
     * FactoryReflectInline<I>().create<E>()
     * FactoryReflectInline<I>().create<E>(arg1, arg2)
     * FactoryReflectInline<I>().create<E>(arg1, arg2, true)
     * FactoryReflectInline<I>().create<E>(arrayOf(arg1, arg2), true)
     * FactoryReflectInline<I>().create<E>(initArgs = arrayOf(arg1, arg2), byKClass = true)
     *
     * @param initArgs
     * @param byKClass
     * @return
     */
    inline fun <reified E> create(vararg initArgs: Any = emptyArray(), byKClass: Boolean = false): E {
        var entity: E? = null
        val argsSize = initArgs.size
        var argsSizeMatched: Boolean = false

        val clazz: Any = when (byKClass) {
            false -> E::class.java
            true -> E::class
        }

        try {
            when (argsSize) {
                0 -> {
                    entity = when (clazz) {
                        is Class<*> -> {
                            clazz.newInstance()
                            // Class.forName(clazz.name).newInstance()
                        }
                        is KClass<*> -> clazz.createInstance()
                        else -> throw Exception("Type of clazz must be Class<*> or KClass<*>.")
                    } as E
                }
                else -> {
                    when (clazz) {
                        is Class<*> -> {
                            val constructors: Array<Constructor<*>> = clazz.constructors
                            constructors.forEach {
                                if (it.parameters.size == argsSize) {
                                    argsSizeMatched = true
                                    entity = when (argsSize) {
                                        1 -> it.newInstance(initArgs[0])
                                        2 -> it.newInstance(initArgs[0], initArgs[1])
                                        3 -> it.newInstance(initArgs[0], initArgs[1], initArgs[2])
                                        4 -> it.newInstance(initArgs[0], initArgs[1], initArgs[2], initArgs[3])
                                        5 -> it.newInstance(initArgs[0], initArgs[1], initArgs[2], initArgs[3], initArgs[4])
                                        else -> throw Exception("No Constructor<*>.newInstance(...) match the args.")
                                    } as E
                                }
                            }
                        }
                        is KClass<*> -> {
                            val constructors: Collection<KFunction<*>> = clazz.constructors
                            constructors.forEach {
                                if (it.parameters.size == argsSize) {
                                    argsSizeMatched = true
                                    entity = when (argsSize) {
                                        1 -> it.call(initArgs[0])
                                        2 -> it.call(initArgs[0], initArgs[1])
                                        3 -> it.call(initArgs[0], initArgs[1], initArgs[2])
                                        4 -> it.call(initArgs[0], initArgs[1], initArgs[2], initArgs[3])
                                        5 -> it.call(initArgs[0], initArgs[1], initArgs[2], initArgs[3], initArgs[4])
                                        else -> throw Exception("No KFunction<*>.call(...) match the args.")
                                    } as E
                                }
                            }
                        }
                        else -> throw Exception("Type of clazz must be Class<*> or KClass<*>.")
                    }

                    if (!argsSizeMatched) throw Exception("No constructor in clazz.constructors match the args size.")
                }
            }
        }
        catch (e: Exception) {
            e.printStackTrace()
            // logE(TAG, t = e)
        }

        entity ?: throw NullPointerException("Return entity must not be null.")

        return try {
            entity as E
        }
        catch (e: TypeCastException) {
            e.printStackTrace()
            throw TypeCastException(e.message)
        }
    }
}