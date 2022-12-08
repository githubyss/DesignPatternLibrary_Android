package com.githubyss.design_pattern.factory

import java.lang.reflect.Constructor
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.createInstance


/**
 * FactoryReflect
 *
 * 通过反射构建具体工厂。
 * 普通函数实现，需要传入待创建的具体类的泛型指定，并且需要传入待创建的具体类的类引用 kotlin：KClass java：Class 做为参数。
 *
 * 设计模式对应工厂方法模式，因为是根据具体类构建具体对象，没有条件判断。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/03/09 14:24:20
 */
class FactoryReflect<I> : IFactoryReflect<I> {
    companion object {
        private val TAG: String = FactoryReflect::class.java.simpleName
    }

    fun <E : I> createByJClass(clazz: Class<*>, vararg initArgs: Any = emptyArray()) = create<E>(clazz, *initArgs)
    fun <E : I> createByKClass(clazz: KClass<*>, vararg initArgs: Any = emptyArray()) = create<E>(clazz, *initArgs)

    /**
     * 构建实例
     *
     * FactoryReflect<I>().create<E>(E::class)
     * FactoryReflect<I>().create<E>(E::class.java)
     *
     * FactoryReflect<I>().create<E>(E::class, arg1, arg2)
     * FactoryReflect<I>().create<E>(E::class, arrayOf(arg1, arg2))
     * FactoryReflect<I>().create<E>(clazz = E::class, initArgs = arrayOf(arg1, arg2))
     *
     * FactoryReflect<I>().create<E>(E::class.java, arg1, arg2)
     * FactoryReflect<I>().create<E>(E::class.java, arrayOf(arg1, arg2))
     * FactoryReflect<I>().create<E>(clazz = E::class.java, initArgs = arrayOf(arg1, arg2))
     *
     * @param clazz
     * @param initArgs
     * @return
     */
    override fun <E : I> create(clazz: Any, vararg initArgs: Any): E {
        var entity: E? = null
        val argsSize = initArgs.size
        var argsSizeMatched = false

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