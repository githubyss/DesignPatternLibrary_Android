package com.githubyss.design_pattern.test.entity.database_operator


interface IDepartmentOperator {
    fun insert(department: Department)
    fun getDepartment(id: Int): Department?
}