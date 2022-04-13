package com.githubyss.design_pattern.test.factory_abstory.database_operator

import com.githubyss.design_pattern.test.entity.data_operator.department.IDepartmentTable
import com.githubyss.design_pattern.test.entity.data_operator.project.IProjectTable
import com.githubyss.design_pattern.test.entity.data_operator.user.IUserTable
import com.githubyss.design_pattern.test.util.createClass


/**
 * DatabaseOperatorByFactorySimpleWithReflect
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/13 11:15:13
 */
object DatabaseOperatorByFactorySimpleWithReflect {
    private const val CLASS_PACKAGE = "com.githubyss.design_pattern.test.entity.data_operator"

    private const val DB_SQL_SERVER = "SqlServer"
    private const val DB_ACCESS = "Access"
    private const val DB_ORACLE = "Oracle"

    private const val ENTITY_USER_TABLE = "user.UserTable"
    private const val ENTITY_DEPARTMENT_TABLE = "department.DepartmentTable"
    private const val ENTITY_PROJECT_TABLE = "project.ProjectTable"

    private const val dbSuffix = DB_ORACLE

    fun createUserTable(): IUserTable {
        return try {
            createClass<IUserTable>(assembleClassName(ENTITY_USER_TABLE))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    fun createDepartmentTable(): IDepartmentTable {
        return try {
            createClass<IDepartmentTable>(assembleClassName(ENTITY_DEPARTMENT_TABLE))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    fun createProjectTable(): IProjectTable {
        return try {
            createClass<IProjectTable>(assembleClassName(ENTITY_PROJECT_TABLE))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    private fun assembleClassName(entity: String): String {
        return "$CLASS_PACKAGE.$entity$dbSuffix"
    }
}