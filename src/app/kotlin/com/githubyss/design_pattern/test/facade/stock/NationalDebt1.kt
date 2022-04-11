package com.githubyss.design_pattern.test.facade.stock


class NationalDebt1 : IStock {
    override fun buy() {
        println("国债1买入")
    }

    override fun sell() {
        println("国债1卖出")
    }
}