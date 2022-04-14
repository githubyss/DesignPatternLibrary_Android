package com.githubyss.design_pattern.test.factory_abstract.database.factory

import com.githubyss.design_pattern.test.factory_abstract.database.entity.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.user.IUserTable


interface IFactoryDatabase {
    fun createUserTable(): IUserTable
    fun createDepartmentTable(): IDepartmentTable
    fun createProjectTable(): IProjectTable
}