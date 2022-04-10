package com.githubyss.design_pattern.test.entity.math_operator


class OperatorMul : IOperatorDyadic {
    override fun calculate(preNumber: Double, postNumber: Double): Double {
        return preNumber * postNumber
    }

    @OperatorType
    override fun operator(): String {
        return OperatorType.MUL
    }
}