package com.githubyss.design_pattern.test.facade.stock


class Stock2 : IStock {
    override fun buy() {
        println("股票2买入")
    }

    override fun sell() {
        println("股票2卖出")
    }
}