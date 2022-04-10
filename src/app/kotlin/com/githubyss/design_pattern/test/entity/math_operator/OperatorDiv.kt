package com.githubyss.design_pattern.test.entity.math_operator


class OperatorDiv : IOperatorDyadic {
    override fun calculate(preNumber: Double, postNumber: Double): Double {
        return if (postNumber != 0.0) preNumber / postNumber
        else {
            println("被除数不能为0")
            Double.NaN
        }
    }

    @OperatorType
    override fun operator(): String {
        return OperatorType.DIV
    }
}