package com.githubyss.design_pattern.test.factory_abstract.database.factory.with_factory_simple_and_reflect

import com.githubyss.design_pattern.test.factory_abstract.database.entity.ITable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.department.IDepartmentTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.project.IProjectTable
import com.githubyss.design_pattern.test.factory_abstract.database.entity.user.IUserTable
import com.githubyss.design_pattern.test.factory_abstract.database.factory.IFactoryDatabase
import com.githubyss.design_pattern.test.util.createClass


/**
 * FactoryDatabaseOperatorWithFactorySimpleAndReflect
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/13 11:15:13
 */
object FactoryDatabaseOperatorWithFactorySimpleAndReflect : IFactoryDatabase {
    private val PACKAGE_PATH = ITable::class.java.packageName

    private const val CLASS_NAME_SUFFIX_DB_SQL_SERVER = "SqlServer"
    private const val CLASS_NAME_SUFFIX_DB_ACCESS = "Access"
    private const val CLASS_NAME_SUFFIX_DB_ORACLE = "Oracle"

    private const val CLASS_NAME_PREFIX_ENTITY_USER_TABLE = "user.UserTable"
    private const val CLASS_NAME_PREFIX_ENTITY_DEPARTMENT_TABLE = "department.DepartmentTable"
    private const val CLASS_NAME_PREFIX_ENTITY_PROJECT_TABLE = "project.ProjectTable"

    private const val classNameSuffixDb = CLASS_NAME_SUFFIX_DB_ORACLE


    override fun createUserTable(): IUserTable {
        return try {
            createClass<IUserTable>(assembleClassName(CLASS_NAME_PREFIX_ENTITY_USER_TABLE))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    override fun createDepartmentTable(): IDepartmentTable {
        return try {
            createClass<IDepartmentTable>(assembleClassName(CLASS_NAME_PREFIX_ENTITY_DEPARTMENT_TABLE))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    override fun createProjectTable(): IProjectTable {
        return try {
            createClass<IProjectTable>(assembleClassName(CLASS_NAME_PREFIX_ENTITY_PROJECT_TABLE))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    private fun assembleClassName(classNamePrefixEntity: String): String {
        return "$PACKAGE_PATH.$classNamePrefixEntity$classNameSuffixDb"
    }
}