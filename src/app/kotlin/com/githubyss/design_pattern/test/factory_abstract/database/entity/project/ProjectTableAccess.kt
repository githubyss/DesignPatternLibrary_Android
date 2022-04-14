package com.githubyss.design_pattern.test.factory_abstract.database.entity.project


class ProjectTableAccess : IProjectTable {
    override fun insert(tableContent: Project) {
        println("在 Access 中给 Project 表增加一条记录")
    }

    override fun getTableContent(id: Int) {
        println("在 Access 中根据 $id 得到 Project 表一条记录")
    }
}