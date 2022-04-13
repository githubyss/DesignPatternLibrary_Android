package com.githubyss.design_pattern.test.entity.data_operator.project


interface IProjectTable {
    fun insert(project: Project)
    fun getProject(id: Int)
}