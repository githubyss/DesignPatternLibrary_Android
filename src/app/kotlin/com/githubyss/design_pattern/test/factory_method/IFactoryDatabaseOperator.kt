package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.database_operator.IDepartmentOperator
import com.githubyss.design_pattern.test.entity.database_operator.IUserOperator


interface IFactoryDatabaseOperator {
    fun createUserOperator(): IUserOperator
    fun createDepartmentOperator(): IDepartmentOperator
}