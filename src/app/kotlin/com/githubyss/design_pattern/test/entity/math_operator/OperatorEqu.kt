package com.githubyss.design_pattern.test.entity.math_operator


class OperatorEqu : IOperatorUnary {
    override fun calculate(number: Double): Double {
        return Double.NaN
    }

    @OperatorType
    override fun operator(): String {
        return OperatorType.EQU
    }
}