package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.database_operator.IDepartmentOperator


interface IFactoryDepartmentOperator {
    fun create(): IDepartmentOperator
}