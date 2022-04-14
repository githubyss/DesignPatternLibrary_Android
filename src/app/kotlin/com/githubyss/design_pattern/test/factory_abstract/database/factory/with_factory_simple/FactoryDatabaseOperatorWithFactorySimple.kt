package com.githubyss.design_pattern.test.factory_abstract.database.factory.with_factory_simple

import com.githubyss.design_pattern.test.factory_abstract.database.entity.department.DepartmentTableAccess
import com.githubyss.design_pattern.test.factory_abstract.database.entity.department.DepartmentTableSqlServer
import com.githubyss.design_pattern.test.factory_abstract.database.entity.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.project.ProjectTableAccess
import com.githubyss.design_pattern.test.factory_abstract.database.entity.project.ProjectTableSqlServer
import com.githubyss.design_pattern.test.factory_abstract.database.entity.user.IUserTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.user.UserTableAccess
import com.githubyss.design_pattern.test.factory_abstract.database.entity.user.UserTableSqlServer
import com.githubyss.design_pattern.test.factory_abstract.database.factory.IFactoryDatabase


/**
 * FactoryDatabaseOperatorWithFactorySimple
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/13 11:15:19
 */
object FactoryDatabaseOperatorWithFactorySimple : IFactoryDatabase {
    private const val DB_SQL_SERVER = "SqlServer"
    private const val DB_ACCESS = "Access"

    private const val db = DB_SQL_SERVER


    override fun createUserTable(): IUserTable {
        return when (db) {
            DB_SQL_SERVER -> UserTableSqlServer()
            DB_ACCESS -> UserTableAccess()
            else -> throw NullPointerException("db config error.")
        }
    }

    override fun createDepartmentTable(): IDepartmentTable {
        return when (db) {
            DB_SQL_SERVER -> DepartmentTableSqlServer()
            DB_ACCESS -> DepartmentTableAccess()
            else -> throw NullPointerException("db config error.")
        }
    }

    override fun createProjectTable(): IProjectTable {
        return when (db) {
            DB_SQL_SERVER -> ProjectTableSqlServer()
            DB_ACCESS -> ProjectTableAccess()
            else -> throw NullPointerException("db config error.")
        }
    }
}