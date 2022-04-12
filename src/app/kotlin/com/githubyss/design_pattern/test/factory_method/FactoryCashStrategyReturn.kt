package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


class FactoryCashStrategyReturn(private var moneyCondition: Double, private var moneyReturn: Double) : IFactoryCashStrategy {
    override fun create(): ICashStrategy {
        return CashStrategyReturn(moneyCondition, moneyReturn)
    }
}