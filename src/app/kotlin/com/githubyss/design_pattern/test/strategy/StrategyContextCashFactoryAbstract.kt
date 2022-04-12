package com.githubyss.design_pattern.test.strategy

import com.githubyss.design_pattern.factory.FactoryReflectInline
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


object StrategyContextCashFactoryAbstract {
    inline fun <reified B : ICashStrategy> acceptCash(money: Double, moneyRebate: Double? = null, moneyCondition: Double? = null, moneyReturn: Double? = null): Double {
        val factory: FactoryReflectInline<ICashStrategy> = FactoryReflectInline<ICashStrategy>()
        val cashStrategy: ICashStrategy = when {
            moneyRebate != null -> factory.create<B>(moneyRebate)
            moneyCondition != null && moneyReturn != null -> factory.create<B>(moneyCondition, moneyReturn)
            else -> factory.create<B>()
        }

        return cashStrategy.acceptCash(money) ?: 0.0
    }
}