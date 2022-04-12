package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


class FactoryCashStrategyNormal : IFactoryCashStrategy{
    override fun create(): ICashStrategy {
        return CashStrategyNormal()
    }
}