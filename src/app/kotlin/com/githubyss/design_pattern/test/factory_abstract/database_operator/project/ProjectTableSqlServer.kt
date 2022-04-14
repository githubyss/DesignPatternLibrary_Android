package com.githubyss.design_pattern.test.factory_abstract.database_operator.project


class ProjectTableSqlServer : IProjectTable {
    override fun insert(project: Project) {
        println("在 SQL Server 中给 Project 表增加一条记录")
    }

    override fun getProject(id: Int) {
        println("在 SQL Server 中根据 $id 得到 Project 表一条记录")
    }
}