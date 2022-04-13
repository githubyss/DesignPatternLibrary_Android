package com.githubyss.design_pattern.test.entity.data_operator.department


interface IDepartmentTable {
    fun insert(department: Department)
    fun getDepartment(id: Int)
}