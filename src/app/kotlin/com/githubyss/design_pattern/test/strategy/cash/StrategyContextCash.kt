package com.githubyss.design_pattern.test.strategy.cash

import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


class StrategyContextCash(private val cashStrategy: ICashStrategy) : ICashStrategy {
    override fun acceptCash(money: Double): Double {
        return cashStrategy.acceptCash(money)
    }
}