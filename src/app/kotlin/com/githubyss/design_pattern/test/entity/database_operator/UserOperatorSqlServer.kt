package com.githubyss.design_pattern.test.entity.database_operator


class UserOperatorSqlServer : IUserOperator {
    override fun insert(user: User) {
        println("在 SQL Server 中给 User 表增加一条记录")
    }

    override fun getUser(id: Int): User? {
        println("在 SQL Server 中根据 id 得到 User 表一条记录")
        return null
    }
}