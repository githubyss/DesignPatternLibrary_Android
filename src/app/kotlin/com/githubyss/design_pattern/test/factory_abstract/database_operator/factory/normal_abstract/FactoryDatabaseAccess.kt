package com.githubyss.design_pattern.test.factory_abstract.database_operator.factory.normal_abstract

import com.githubyss.design_pattern.test.factory_abstract.database_operator.factory.IFactoryDatabase
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.department.DepartmentTableAccess
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.project.ProjectTableAccess
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.user.IUserTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.user.UserTableAccess


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