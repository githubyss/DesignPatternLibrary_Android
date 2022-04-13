package com.githubyss.design_pattern.test.entity.data_operator.user


class UserTableOracle : IUserTable {
    override fun insert(user: User) {
        println("在 Oracle 中给 User 表增加一条记录")
    }

    override fun getUser(id: Int) {
        println("在 Oracle 中根据 $id 得到 User 表一条记录")
    }
}