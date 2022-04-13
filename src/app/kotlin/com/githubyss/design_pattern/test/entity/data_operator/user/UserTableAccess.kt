package com.githubyss.design_pattern.test.entity.data_operator.user


class UserTableAccess : IUserTable {
    override fun insert(user: User) {
        println("在 Access 中给 User 表增加一条记录")
    }

    override fun getUser(id: Int) {
        println("在 Access 中根据 $id 得到 User 表一条记录")
    }
}