package com.githubyss.design_pattern.test.factory_simple

import com.githubyss.design_pattern.test.entity.math_operator.*


object FactoryOperator {
    fun create(@OperatorType type: String): IOperator {
        return when (type) {
            OperatorType.ADD -> OperatorAdd()
            OperatorType.SUB -> OperatorSub()
            OperatorType.MUL -> OperatorMul()
            OperatorType.DIV -> OperatorDiv()
            OperatorType.EQU -> OperatorEqu()
            else -> OperatorNan()
        }
    }
}
