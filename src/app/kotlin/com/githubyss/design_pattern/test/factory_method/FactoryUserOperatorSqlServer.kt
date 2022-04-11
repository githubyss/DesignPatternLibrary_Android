package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.database_operator.IUserOperator
import com.githubyss.design_pattern.test.entity.database_operator.UserOperatorSqlServer


class FactoryUserOperatorSqlServer : IFactoryUserOperator {
    override fun create(): IUserOperator {
        return UserOperatorSqlServer()
    }
}