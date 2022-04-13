package com.githubyss.design_pattern.test.factory_abstory

import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.entity.data_operator.department.Department
import com.githubyss.design_pattern.test.entity.data_operator.department.IDepartmentTable
import com.githubyss.design_pattern.test.entity.data_operator.project.IProjectTable
import com.githubyss.design_pattern.test.entity.data_operator.project.Project
import com.githubyss.design_pattern.test.entity.data_operator.user.IUserTable
import com.githubyss.design_pattern.test.entity.data_operator.user.User


private val id: Int = 0
private val user: User = User(0, "用户0")
private val department: Department = Department(0, "部门0")
private val project: Project = Project(0, "工程0")

fun factoryAbstract() {
    println("$PREFIX FactoryAbstract 抽象工厂模式")
    println()


    val factoryDatabase: IFactoryDatabase = FactoryDatabaseSqlServer()

    val userTable: IUserTable = factoryDatabase.createUserTable()
    userTable.insert(user)
    userTable.getUser(id)

    val departmentTable: IDepartmentTable = factoryDatabase.createDepartmentTable()
    departmentTable.insert(department)
    departmentTable.getDepartment(id)

    val projectTable: IProjectTable = factoryDatabase.createProjectTable()
    projectTable.insert(project)
    projectTable.getProject(id)
    println()



    println("$PREFIX FactoryAbstract 抽象工厂模式 & FactorySimple 简单工厂模式")
    println()


    val userTableByFactorySimple: IUserTable = DatabaseOperatorByFactorySimple.createUserTable()
    userTableByFactorySimple.insert(user)
    userTableByFactorySimple.getUser(id)

    val departmentTableByFactorySimple: IDepartmentTable = DatabaseOperatorByFactorySimple.createDepartmentTable()
    departmentTableByFactorySimple.insert(department)
    departmentTableByFactorySimple.getDepartment(id)

    val projectTableByFactorySimple: IProjectTable = DatabaseOperatorByFactorySimple.createProjectTable()
    projectTableByFactorySimple.insert(project)
    projectTableByFactorySimple.getProject(id)
    println()



    println("$PREFIX FactoryAbstract 抽象工厂模式 & FactorySimple 简单工厂模式 & Reflect 反射")
    println()


    val userTableByFactorySimpleWithReflect: IUserTable = DatabaseOperatorByFactorySimpleWithReflect.createUserTable()
    userTableByFactorySimpleWithReflect.insert(user)
    userTableByFactorySimpleWithReflect.getUser(id)

    val departmentTableByFactorySimpleWithReflect: IDepartmentTable = DatabaseOperatorByFactorySimpleWithReflect.createDepartmentTable()
    departmentTableByFactorySimpleWithReflect.insert(department)
    departmentTableByFactorySimpleWithReflect.getDepartment(id)

    val projectTableByFactorySimpleWithReflect: IProjectTable = DatabaseOperatorByFactorySimpleWithReflect.createProjectTable()
    projectTableByFactorySimpleWithReflect.insert(project)
    projectTableByFactorySimpleWithReflect.getProject(id)
    println()
}