package com.githubyss.design_pattern.test.factory_abstract.database.entity.project


class ProjectTableOracle : IProjectTable {
    override fun insert(project: Project) {
        println("在 Oracle 中给 Project 表增加一条记录")
    }

    override fun getProject(id: Int) {
        println("在 Oracle 中根据 $id 得到 Project 表一条记录")
    }
}