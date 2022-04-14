package com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.department


interface IDepartmentTable {
    fun insert(department: Department)
    fun getDepartment(id: Int)
}