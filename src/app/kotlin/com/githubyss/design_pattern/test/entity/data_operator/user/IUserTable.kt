package com.githubyss.design_pattern.test.entity.data_operator.user


interface IUserTable {
    fun insert(user: User)
    fun getUser(id: Int)
}