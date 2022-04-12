package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


class FactoryCashStrategyRebate(private var moneyRebate: Double) : IFactoryCashStrategy {
    override fun create(): ICashStrategy {
        return CashStrategyRebate(moneyRebate)
    }
}