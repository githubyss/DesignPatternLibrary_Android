package com.githubyss.design_pattern.test.factory_abstory

import com.githubyss.design_pattern.test.entity.data_operator.department.DepartmentTableAccess
import com.githubyss.design_pattern.test.entity.data_operator.department.IDepartmentTable
import com.githubyss.design_pattern.test.entity.data_operator.project.IProjectTable
import com.githubyss.design_pattern.test.entity.data_operator.project.ProjectTableAccess
import com.githubyss.design_pattern.test.entity.data_operator.user.IUserTable
import com.githubyss.design_pattern.test.entity.data_operator.user.UserTableAccess


class FactoryDatabaseAccess : IFactoryDatabase {
    override fun createUserTable(): IUserTable {
        return UserTableAccess()
    }

    override fun createDepartmentTable(): IDepartmentTable {
        return DepartmentTableAccess()
    }

    override fun createProjectTable(): IProjectTable {
        return ProjectTableAccess()
    }
}