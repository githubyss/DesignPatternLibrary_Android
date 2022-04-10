package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.math_operator.IOperator
import com.githubyss.design_pattern.test.entity.math_operator.OperatorEqu


object FactoryOperatorEqu : IFactoryOperator {
    override fun create(): IOperator {
        return OperatorEqu()
    }
}