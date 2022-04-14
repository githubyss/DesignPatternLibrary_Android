package com.githubyss.design_pattern.test.factory_abstract.database.entity.project


interface IProjectTable {
    fun insert(project: Project)
    fun getProject(id: Int)
}