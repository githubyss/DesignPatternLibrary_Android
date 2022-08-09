package com.githubyss.design_pattern.test.entity.cash

import kotlin.math.floor


class CashStrategyReturn(private var moneyCondition: Double, private var moneyReturn: Double) : ICashStrategy {
    override fun acceptCash(money: Double): Double {
        return when {
            moneyCondition <= 0.0 || moneyReturn <= 0.0 -> money
            money / moneyCondition > 1 -> money - floor(money / moneyCondition) * moneyReturn
            else -> money
        }
    }
}