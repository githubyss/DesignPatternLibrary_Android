package com.githubyss.design_pattern.test.entity.database_operator


interface IUserOperator {
    fun insert(user: User)
    fun getUser(id: Int): User?
}