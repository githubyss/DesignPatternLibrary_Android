package com.githubyss.design_pattern.test.factory_abstract.database.entity.user


class UserTableSqlServer : IUserTable {
    override fun insert(user: User) {
        println("在 SQL Server 中给 User 表增加一条记录")
    }

    override fun getUser(id: Int) {
        println("在 SQL Server 中根据 $id 得到 User 表一条记录")
    }
}