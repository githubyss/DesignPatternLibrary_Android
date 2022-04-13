package com.githubyss.design_pattern.test.factory_abstory

import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.entity.data_operator.department.Department
import com.githubyss.design_pattern.test.entity.data_operator.department.IDepartmentTable
import com.githubyss.design_pattern.test.entity.data_operator.project.IProjectTable
import com.githubyss.design_pattern.test.entity.data_operator.project.Project
import com.githubyss.design_pattern.test.entity.data_operator.user.IUserTable
import com.githubyss.design_pattern.test.entity.data_operator.user.User
import com.githubyss.design_pattern.test.factory_abstory.database_operator.DatabaseOperatorByFactorySimple
import com.githubyss.design_pattern.test.factory_abstory.database_operator.DatabaseOperatorByFactorySimpleWithReflect
import com.githubyss.design_pattern.test.factory_abstory.database_operator.FactoryDatabaseSqlServer
import com.githubyss.design_pattern.test.factory_abstory.database_operator.IFactoryDatabase


/**
 * TestFactoryAbstract
 *
 * 使用场景：
 *
 * 特点：
 * - 针对的是多个产品等级结构。
 * - 多个抽象产品类。
 * - 每个抽象产品类可以派生出多个具体产品类（同一抽象产品类的每个具体产品类的实例由这个抽象产品类对应的具体工厂类创建）。
 * - 一个抽象工厂类（有多个生产方法，对应每个抽象产品类派生的多个具体产品类）。
 * - 这个抽象工厂类可以派生出多个具体工厂类（关心的是抽象产品类，有几种抽象产品类，就有几个具体工厂类，而工厂内部的生产方法对应每个抽象产品类派生的多个具体产品类）。
 * - 每个具体工厂类可以创建多个具体产品类的实例（每个具体工厂对应某个抽象产品类的具体产品的创建）。
 *
 * 举例：
 * - 两个抽象产品类：普通水果，转基因水果。
 * - 每个抽象产品类可以派生出三个具体产品类：普通水果->普通香蕉、普通草莓、普通西瓜，转基因水果->转基因香蕉、转基因草莓、转基因西瓜。
 * - 一个抽象工厂类，有三个生产方法，对应每个抽象产品类派生的三个具体产品类：种植工厂:生产香蕉、生产草莓、生产西瓜。
 * - 这个抽象工厂类可以派生出两个具体工厂类：种植工厂->普通种植工厂、转基因种植工厂。
 * - 每个具体工厂类，有三个生产方法，总共可以创建六个具体产品类的实例：普通种植工厂:生产香蕉、生产草莓、生产西瓜，转基因种植工厂:生产香蕉、生产草莓、生产西瓜。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/13 11:49:08
 */

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