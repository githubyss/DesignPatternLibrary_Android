package com.githubyss.design_pattern.test.entity.cash


class CashStrategyRebate(var moneyRebate: Double = 1.0) : ICashStrategy {
    override fun acceptCash(money: Double): Double {
        val moneyCashed = money * moneyRebate
        println("消费:$moneyCashed")
        return moneyCashed
    }
}