package com.githubyss.design_pattern.test.strategy

import com.githubyss.design_pattern.factory_abstract.FactoryConcreteInline
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


object StrategyContextCashFactoryAbstract {
    inline fun <reified B : ICashStrategy> acceptCash(money: Double, moneyRebate: Double? = null, moneyCondition: Double? = null, moneyReturn: Double? = null): Double {
        val factory: FactoryConcreteInline<B> = FactoryConcreteInline<B>()
        val cashStrategy: ICashStrategy? = when {
            moneyRebate != null -> factory.create<B>(initArgs = arrayOf(moneyRebate))
            moneyCondition != null && moneyReturn != null -> factory.create<B>(initArgs = arrayOf(moneyCondition, moneyReturn))
            else -> factory.create<B>()
        }

        return cashStrategy?.acceptCash(money) ?: 0.0
    }
}