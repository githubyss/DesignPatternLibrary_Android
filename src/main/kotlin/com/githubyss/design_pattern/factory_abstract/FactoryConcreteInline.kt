package com.githubyss.design_pattern.factory_abstract

import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.reflect.Constructor
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.createInstance


/**
 * FactoryConcreteInline
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/03/09 15:46:13
 */
class FactoryConcreteInline<I> {
    companion object {
        val TAG: String = FactoryConcreteInline::class.java.simpleName
    }

    /**
     * 构建实例
     *
     * FactoryConcreteInline<I>().create<E>(arg1, arg2)
     *
     * FactoryConcreteInline<I>().create<E>(arg1, arg2, true)
     *
     * FactoryConcreteInline<I>().create<E>(arrayOf(arg1, arg2), true)
     *
     * FactoryConcreteInline<I>().create<E>(initArgs = arrayOf(arg1, arg2), byKClass = true)
     *
     * @param initArgs
     * @param byKClass
     * @return
     */
    inline fun <reified E : I> create(vararg initArgs: Any = emptyArray(), byKClass: Boolean = false): E {
        var entity: E? = null
        val argsSize = initArgs.size
        var argsSizeMatched: Boolean = false

        val clazz: Any = when (byKClass) {
            true -> E::class
            false -> E::class.java
        }

        try {
            when (argsSize) {
                0 -> {
                    entity = when (clazz) {
                        is Class<*> -> {
                            Class.forName(clazz.name).newInstance() as E
                        }
                        is KClass<*> -> {
                            clazz.createInstance() as E
                        }
                        else -> {
                            throw Exception("Type of clazz must be Class<*> or KClass<*>.")
                        }
                    }
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
                        else -> {
                            throw Exception("Type of clazz must be Class<*> or KClass<*>.")
                        }
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