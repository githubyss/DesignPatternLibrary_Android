package com.githubyss.design_pattern.test.factory_abstract.database.factory.normal_abstract

import com.githubyss.design_pattern.test.factory_abstract.database.entity.department.DepartmentTableAccess
import com.githubyss.design_pattern.test.factory_abstract.database.entity.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.project.ProjectTableAccess
import com.githubyss.design_pattern.test.factory_abstract.database.entity.user.IUserTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.user.UserTableAccess
import com.githubyss.design_pattern.test.factory_abstract.database.factory.IFactoryDatabase


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