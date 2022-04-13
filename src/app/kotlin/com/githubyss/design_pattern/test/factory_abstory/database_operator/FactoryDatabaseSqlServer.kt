package com.githubyss.design_pattern.test.factory_abstory.database_operator

import com.githubyss.design_pattern.test.entity.data_operator.department.DepartmentTableSqlServer
import com.githubyss.design_pattern.test.entity.data_operator.department.IDepartmentTable
import com.githubyss.design_pattern.test.entity.data_operator.project.IProjectTable
import com.githubyss.design_pattern.test.entity.data_operator.project.ProjectTableSqlServer
import com.githubyss.design_pattern.test.entity.data_operator.user.IUserTable
import com.githubyss.design_pattern.test.entity.data_operator.user.UserTableSqlServer


class FactoryDatabaseSqlServer : IFactoryDatabase {
    override fun createUserTable(): IUserTable {
        return UserTableSqlServer()
    }

    override fun createDepartmentTable(): IDepartmentTable {
        return DepartmentTableSqlServer()
    }

    override fun createProjectTable(): IProjectTable {
        return ProjectTableSqlServer()
    }
}