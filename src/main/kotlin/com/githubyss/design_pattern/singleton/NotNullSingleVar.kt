package com.githubyss.design_pattern.singleton

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


/**
 * NotNullSingleVar
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/18 14:59:38
 */
class NotNullSingleVar<T> : ReadWriteProperty<Any?, T> {
    private var value: T? = null

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return value ?: throw IllegalStateException("Must be set a value not null.")
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        this.value = when {
            this.value != null -> this.value
            value == null -> throw IllegalStateException("Can not be set null.")
            else -> value
        }
    }
}