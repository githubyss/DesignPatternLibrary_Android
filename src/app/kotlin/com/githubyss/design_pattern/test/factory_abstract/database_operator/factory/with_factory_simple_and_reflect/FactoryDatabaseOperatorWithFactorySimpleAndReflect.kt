package com.githubyss.design_pattern.test.factory_abstract.database_operator.factory.with_factory_simple_and_reflect

import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.user.IUserTable
import com.githubyss.design_pattern.test.factory_abstract.database_operator.factory.IFactoryDatabase
import com.githubyss.design_pattern.test.util.createClass


/**
 * FactoryDatabaseOperatorWithFactorySimpleAndReflect
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/13 11:15:13
 */
object FactoryDatabaseOperatorWithFactorySimpleAndReflect : IFactoryDatabase {
    private const val CLASS_PACKAGE = "com.githubyss.design_pattern.test.entity.data_operator"

    private const val DB_SQL_SERVER = "SqlServer"
    private const val DB_ACCESS = "Access"
    private const val DB_ORACLE = "Oracle"

    private const val ENTITY_USER_TABLE = "user.UserTable"
    private const val ENTITY_DEPARTMENT_TABLE = "department.DepartmentTable"
    private const val ENTITY_PROJECT_TABLE = "project.ProjectTable"

    private const val dbSuffix = DB_ORACLE


    override fun createUserTable(): IUserTable {
        return try {
            createClass<IUserTable>(assembleClassName(ENTITY_USER_TABLE))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    override fun createDepartmentTable(): IDepartmentTable {
        return try {
            createClass<IDepartmentTable>(assembleClassName(ENTITY_DEPARTMENT_TABLE))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    override fun createProjectTable(): IProjectTable {
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