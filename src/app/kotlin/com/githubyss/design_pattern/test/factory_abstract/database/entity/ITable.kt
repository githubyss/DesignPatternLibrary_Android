package com.githubyss.design_pattern.test.factory_abstract.database.entity


interface ITable<T> {
    fun insert(tableContent: T)
    fun getTableContent(id: Int)
}