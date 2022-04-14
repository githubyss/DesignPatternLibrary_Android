package com.githubyss.design_pattern.test.factory_abstract.database.entity.department


class DepartmentTableOracle : IDepartmentTable {
    override fun insert(tableContent: Department) {
        println("在 Oracle 中给 Department 表增加一条记录")
    }

    override fun getTableContent(id: Int) {
        println("在 Oracle 中根据 $id 得到 Department 表一条记录")
    }
}