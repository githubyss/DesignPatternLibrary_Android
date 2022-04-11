package com.githubyss.design_pattern.test.facade.stock


class Stock3 : IStock {
    override fun buy() {
        println("股票3买入")
    }

    override fun sell() {
        println("股票3卖出")
    }
}