package com.githubyss.design_pattern.test.facade.stock


class Stock1 : IStock {
    override fun buy() {
        println("股票1买入")
    }

    override fun sell() {
        println("股票1卖出")
    }
}