package com.githubyss.design_pattern.test.entity.math_operator


class OperatorNan : IOperator {
    @OperatorType
    override fun operator(): String {
        return OperatorType.NAN
    }
}