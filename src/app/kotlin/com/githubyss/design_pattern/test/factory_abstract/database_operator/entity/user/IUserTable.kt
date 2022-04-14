package com.githubyss.design_pattern.test.factory_abstract.database_operator.entity.user


interface IUserTable {
    fun insert(user: User)
    fun getUser(id: Int)
}