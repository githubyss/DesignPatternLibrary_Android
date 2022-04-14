package com.githubyss.design_pattern.test.factory_abstract.database_operator.factory

import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.user.IUserTable


interface IFactoryDatabase {
    fun createUserTable(): IUserTable
    fun createDepartmentTable(): IDepartmentTable
    fun createProjectTable(): IProjectTable
}