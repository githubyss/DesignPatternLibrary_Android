package com.githubyss.design_pattern.test.factory_abstract.database.entity.user


interface IUserTable {
    fun insert(user: User)
    fun getUser(id: Int)
}