package com.githubyss.design_pattern.test.entity.stock


class Realty1 : IStock {
    override fun buy() {
        println("房地产1买入")
    }

    override fun sell() {
        println("房地产1卖出")
    }
}