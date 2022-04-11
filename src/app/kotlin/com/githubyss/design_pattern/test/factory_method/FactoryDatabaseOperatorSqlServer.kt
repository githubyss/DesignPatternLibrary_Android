package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.database_operator.DepartmentOperatorSqlServer
import com.githubyss.design_pattern.test.entity.database_operator.IDepartmentOperator
import com.githubyss.design_pattern.test.entity.database_operator.IUserOperator
import com.githubyss.design_pattern.test.entity.database_operator.UserOperatorSqlServer


class FactoryDatabaseOperatorSqlServer : IFactoryDatabaseOperator {
    override fun createUserOperator(): IUserOperator {
        return UserOperatorSqlServer()
    }

    override fun createDepartmentOperator(): IDepartmentOperator {
        return DepartmentOperatorSqlServer()
    }
}