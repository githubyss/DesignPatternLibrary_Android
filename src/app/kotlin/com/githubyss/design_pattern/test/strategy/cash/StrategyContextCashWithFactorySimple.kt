package com.githubyss.design_pattern.test.strategy.cash

import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


class StrategyContextCashWithFactorySimple(private var type: String) : ICashStrategy {
    override fun acceptCash(money: Double): Double {
        val cashStrategy: ICashStrategy = when (type) {
            "正常收费" -> CashStrategyNormal()
            "打8折" -> CashStrategyRebate(0.8)
            "满300返100" -> CashStrategyReturn(300.0, 100.0)
            else -> CashStrategyNormal()
        }
        return cashStrategy.acceptCash(money)
    }
}