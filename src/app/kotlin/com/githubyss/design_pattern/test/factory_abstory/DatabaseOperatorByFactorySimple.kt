package com.githubyss.design_pattern.test.factory_abstory

import com.githubyss.design_pattern.test.entity.data_operator.department.DepartmentTableAccess
import com.githubyss.design_pattern.test.entity.data_operator.department.DepartmentTableSqlServer
import com.githubyss.design_pattern.test.entity.data_operator.department.IDepartmentTable
import com.githubyss.design_pattern.test.entity.data_operator.project.IProjectTable
import com.githubyss.design_pattern.test.entity.data_operator.project.ProjectTableAccess
import com.githubyss.design_pattern.test.entity.data_operator.project.ProjectTableSqlServer
import com.githubyss.design_pattern.test.entity.data_operator.user.IUserTable
import com.githubyss.design_pattern.test.entity.data_operator.user.UserTableAccess
import com.githubyss.design_pattern.test.entity.data_operator.user.UserTableSqlServer


/**
 * DatabaseOperatorByFactorySimple
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/13 11:15:19
 */
object DatabaseOperatorByFactorySimple {
    private const val DB_SQL_SERVER = "SqlServer"
    private const val DB_ACCESS = "Access"

    private const val db = DB_SQL_SERVER

    fun createUserTable(): IUserTable {
        return when (db) {
            DB_SQL_SERVER -> UserTableSqlServer()
            DB_ACCESS -> UserTableAccess()
            else -> throw NullPointerException("db config error.")
        }
    }

    fun createDepartmentTable(): IDepartmentTable {
        return when (db) {
            DB_SQL_SERVER -> DepartmentTableSqlServer()
            DB_ACCESS -> DepartmentTableAccess()
            else -> throw NullPointerException("db config error.")
        }
    }

    fun createProjectTable(): IProjectTable {
        return when (db) {
            DB_SQL_SERVER -> ProjectTableSqlServer()
            DB_ACCESS -> ProjectTableAccess()
            else -> throw NullPointerException("db config error.")
        }
    }
}