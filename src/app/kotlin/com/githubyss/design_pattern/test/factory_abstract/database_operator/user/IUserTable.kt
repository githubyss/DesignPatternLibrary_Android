package com.githubyss.design_pattern.test.factory_abstract.database_operator.user


interface IUserTable {
    fun insert(user: User)
    fun getUser(id: Int)
}