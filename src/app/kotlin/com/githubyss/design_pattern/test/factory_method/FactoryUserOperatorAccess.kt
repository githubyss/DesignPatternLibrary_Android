package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.database_operator.IUserOperator
import com.githubyss.design_pattern.test.entity.database_operator.UserOperatorAccess


class FactoryUserOperatorAccess : IFactoryUserOperator {
    override fun create(): IUserOperator {
        return UserOperatorAccess()
    }
}