package com.githubyss.design_pattern.test.entity.data_operator.department


class DepartmentTableSqlServer : IDepartmentTable {
    override fun insert(department: Department) {
        println("在 SQL Server 中给 Department 表增加一条记录")
    }

    override fun getDepartment(id: Int) {
        println("在 SQL Server 中根据 $id 得到 Department 表一条记录")
    }
}