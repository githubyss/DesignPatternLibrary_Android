package com.githubyss.design_pattern.test.factory_abstract.database.factory.normal_abstract

import com.githubyss.design_pattern.test.factory_abstract.database.entity.department.DepartmentTableSqlServer
import com.githubyss.design_pattern.test.factory_abstract.database.entity.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.project.ProjectTableSqlServer
import com.githubyss.design_pattern.test.factory_abstract.database.entity.user.IUserTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.user.UserTableSqlServer
import com.githubyss.design_pattern.test.factory_abstract.database.factory.IFactoryDatabase


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