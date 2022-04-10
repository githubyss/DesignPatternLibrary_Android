package com.githubyss.design_pattern.test.strategy

import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn


class StrategyContextCashFactorySimple(private var type: String) {
    fun acceptCash(money: Double): Double {
        val cash = when (type) {
            "正常收费" -> CashStrategyNormal()
            "打8折" -> CashStrategyRebate(0.8)
            "满300返100" -> CashStrategyReturn(300.0, 100.0)
            else -> CashStrategyNormal()
        }
        return cash.acceptCash(money)
    }
}