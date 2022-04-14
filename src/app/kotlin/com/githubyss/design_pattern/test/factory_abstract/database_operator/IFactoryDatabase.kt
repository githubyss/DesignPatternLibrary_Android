package com.githubyss.design_pattern.test.factory_abstract.database_operator

import com.githubyss.design_pattern.test.factory_abstract.database_operator.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.user.IUserTable


interface IFactoryDatabase {
    fun createUserTable(): IUserTable
    fun createDepartmentTable(): IDepartmentTable
    fun createProjectTable(): IProjectTable
}