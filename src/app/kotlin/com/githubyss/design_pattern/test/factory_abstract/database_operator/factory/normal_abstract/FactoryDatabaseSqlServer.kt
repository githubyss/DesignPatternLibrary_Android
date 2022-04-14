package com.githubyss.design_pattern.test.factory_abstract.database_operator.factory.normal_abstract

import com.githubyss.design_pattern.test.factory_abstract.database_operator.factory.IFactoryDatabase
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.department.DepartmentTableSqlServer
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.project.ProjectTableSqlServer
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.user.IUserTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.user.UserTableSqlServer


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