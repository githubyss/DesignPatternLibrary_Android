package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.math_operator.IOperator


interface IFactoryOperator {
    fun create(): IOperator
}