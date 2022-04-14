package com.githubyss.design_pattern.test.util


/**
 * Utils
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/13 10:40:25
 */

/** ****************************** Properties ****************************** */

private const val TAG: String = "Utils"


/** ****************************** Functions ****************************** */

/** ******************** Creator ******************** */

inline fun <reified I> createClass(classNameWithPackagePath: String): I {
    val clazz: Class<out Any> = Class.forName(classNameWithPackagePath)
    return clazz.newInstance() as I
}