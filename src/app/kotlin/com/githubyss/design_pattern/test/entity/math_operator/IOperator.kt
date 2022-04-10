package com.githubyss.design_pattern.test.entity.math_operator


interface IOperator {
    @OperatorType
    fun operator(): String
}