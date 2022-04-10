package com.githubyss.design_pattern.test.factory_simple

import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


object FactoryCash {
    fun create(type: String): ICashStrategy {
        return when (type) {
            "正常收费" -> CashStrategyNormal()
            "打8折" -> CashStrategyRebate(0.8)
            "满300返100" -> CashStrategyReturn(300.0, 100.0)
            else -> CashStrategyNormal()
        }
    }
}