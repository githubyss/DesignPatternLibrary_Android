package com.githubyss.design_pattern.test.factory_abstract.database.entity.user


class UserTableAccess : IUserTable {
    override fun insert(tableContent: User) {
        println("在 Access 中给 User 表增加一条记录")
    }

    override fun getTableContent(id: Int) {
        println("在 Access 中根据 $id 得到 User 表一条记录")
    }
}