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

    @RequiresApi(Build.VERSION_CODES.O)
    inline fun <reified E : I> create(byKClass: Boolean = false, vararg initArgs: Any = emptyArray()): E? {
        var entity: I? = null
        val argsSize = initArgs.size
        val clazz: Any = when (byKClass) {
            true -> E::class
            false -> E::class.java
        }

        try {
            when (argsSize) {
                0 -> {
                    entity = when (clazz) {
                        is Class<*> -> {
                            Class.forName(clazz.name).newInstance() as I?
                        }
                        is KClass<*> -> {
                            clazz.createInstance() as I?
                        }
                        else -> {
                            null
                        }
                    }
                }
                else -> {
                    when (clazz) {
                        is Class<*> -> {
                            val constructors: Array<Constructor<*>> = clazz.constructors
                            constructors.forEach {
                                if (it.parameters.size == argsSize) {
                                    entity = when (argsSize) {
                                        1 -> it.newInstance(initArgs[0])
                                        2 -> it.newInstance(initArgs[0], initArgs[1])
                                        3 -> it.newInstance(initArgs[0], initArgs[1], initArgs[2])
                                        4 -> it.newInstance(initArgs[0], initArgs[1], initArgs[2], initArgs[3])
                                        5 -> it.newInstance(initArgs[0], initArgs[1], initArgs[2], initArgs[3], initArgs[4])
                                        else -> null
                                    } as I?
                                }
                            }
                        }
                        is KClass<*> -> {
                            val constructors: Collection<KFunction<*>> = clazz.constructors
                            constructors.forEach {
                                if (it.parameters.size == argsSize) {
                                    entity = when (argsSize) {
                                        1 -> it.call(initArgs[0])
                                        2 -> it.call(initArgs[0], initArgs[1])
                                        3 -> it.call(initArgs[0], initArgs[1], initArgs[2])
                                        4 -> it.call(initArgs[0], initArgs[1], initArgs[2], initArgs[3])
                                        5 -> it.call(initArgs[0], initArgs[1], initArgs[2], initArgs[3], initArgs[4])
                                        else -> null
                                    } as I?
                                }
                            }
                        }
                        else -> {
                            entity = null
                        }
                    }

                }
            }
        }
        catch (e: Exception) {
            e.printStackTrace()
            // logE(TAG, t = e)
        }

        return try {
            entity as E?
        }
        catch (e: TypeCastException) {
            null
        }
    }
}