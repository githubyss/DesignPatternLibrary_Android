package com.githubyss.design_pattern.test.entity.math_operator


interface IOperatorDyadic : IOperator {
    fun calculate(preNumber: Double, postNumber: Double): Double
}