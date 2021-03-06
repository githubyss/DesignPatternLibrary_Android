package com.githubyss.design_pattern.test.entity.cash


class CashStrategyRebate(private var moneyRebate: Double) : ICashStrategy {
    override fun acceptCash(money: Double): Double {
        val moneyCashed = money * moneyRebate
        println("消费:$moneyCashed")
        return moneyCashed
    }
}