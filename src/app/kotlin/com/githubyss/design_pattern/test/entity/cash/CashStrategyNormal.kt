package com.githubyss.design_pattern.test.entity.cash


class CashStrategyNormal : ICashStrategy {
    override fun acceptCash(money: Double): Double {
        return money
    }
}