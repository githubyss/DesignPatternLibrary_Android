package com.githubyss.design_pattern.test.factory_abstory

import com.githubyss.design_pattern.test.entity.data_operator.department.IDepartmentTable
import com.githubyss.design_pattern.test.entity.data_operator.project.IProjectTable
import com.githubyss.design_pattern.test.entity.data_operator.user.IUserTable


interface IFactoryDatabase {
    fun createUserTable(): IUserTable
    fun createDepartmentTable(): IDepartmentTable
    fun createProjectTable(): IProjectTable
}