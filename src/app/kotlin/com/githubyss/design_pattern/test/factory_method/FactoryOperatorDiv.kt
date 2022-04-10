package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.math_operator.IOperator
import com.githubyss.design_pattern.test.entity.math_operator.OperatorDiv


object FactoryOperatorDiv : IFactoryOperator {
    override fun create(): IOperator {
        return OperatorDiv()
    }
}