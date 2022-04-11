package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.database_operator.DepartmentOperatorAccess
import com.githubyss.design_pattern.test.entity.database_operator.IDepartmentOperator


class FactoryDepartmentOperatorAccess : IFactoryDepartmentOperator {
    override fun create(): IDepartmentOperator {
        return DepartmentOperatorAccess()
    }
}