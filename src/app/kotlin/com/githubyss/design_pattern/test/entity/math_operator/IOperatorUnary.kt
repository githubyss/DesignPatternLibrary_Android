package com.githubyss.design_pattern.test.entity.math_operator


interface IOperatorUnary : IOperator {
    fun calculate(number: Double): Double
}