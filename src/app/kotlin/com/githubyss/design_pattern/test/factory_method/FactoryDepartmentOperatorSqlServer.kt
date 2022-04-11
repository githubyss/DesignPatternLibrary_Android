package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.database_operator.DepartmentOperatorSqlServer
import com.githubyss.design_pattern.test.entity.database_operator.IDepartmentOperator


class FactoryDepartmentOperatorSqlServer : IFactoryDepartmentOperator {
    override fun create(): IDepartmentOperator {
        return DepartmentOperatorSqlServer()
    }
}