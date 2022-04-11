package com.githubyss.design_pattern.test.entity.database_operator


class DepartmentOperatorAccess : IDepartmentOperator {
    override fun insert(department: Department) {
        println("在 Access 中给 Department 表增加一条记录")

    }

    override fun getDepartment(id: Int): Department? {
        println("在 Access 中根据 id 得到 Department 表一条记录")
        return null
    }
}