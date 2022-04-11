package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.database_operator.DepartmentOperatorAccess
import com.githubyss.design_pattern.test.entity.database_operator.IDepartmentOperator
import com.githubyss.design_pattern.test.entity.database_operator.IUserOperator
import com.githubyss.design_pattern.test.entity.database_operator.UserOperatorAccess


class FactoryDatabaseOperatorAccess : IFactoryDatabaseOperator {
    override fun createUserOperator(): IUserOperator {
        return UserOperatorAccess()
    }

    override fun createDepartmentOperator(): IDepartmentOperator {
        return DepartmentOperatorAccess()
    }
}