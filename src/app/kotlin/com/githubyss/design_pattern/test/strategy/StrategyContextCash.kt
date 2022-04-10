package com.githubyss.design_pattern.test.strategy

import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


class StrategyContextCash(private var cashStrategy: ICashStrategy) {
    fun acceptCash(money: Double): Double {
        return cashStrategy.acceptCash(money)
    }
}