package com.githubyss.design_pattern.test.strategy

import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn


fun strategy() {
    println("$PREFIX Strategy 策略模式")
    println()

    val strategyCashNormal: StrategyContextCash = StrategyContextCash(CashStrategyNormal())
    val strategyCashRebate: StrategyContextCash = StrategyContextCash(CashStrategyRebate(0.8))
    val strategyCashReturn: StrategyContextCash = StrategyContextCash(CashStrategyReturn(300.0, 100.0))
    strategyCashNormal.acceptCash(1000.0)
    strategyCashRebate.acceptCash(1000.0)
    strategyCashReturn.acceptCash(1000.0)
    println()

    val strategyCashNormalFactorySimple: StrategyContextCashFactorySimple = StrategyContextCashFactorySimple("正常收费")
    val strategyCashRebateFactorySimple: StrategyContextCashFactorySimple = StrategyContextCashFactorySimple("打8折")
    val strategyCashReturnFactorySimple: StrategyContextCashFactorySimple = StrategyContextCashFactorySimple("满300返100")
    strategyCashNormalFactorySimple.acceptCash(1000.0)
    strategyCashRebateFactorySimple.acceptCash(1000.0)
    strategyCashReturnFactorySimple.acceptCash(1000.0)
    println()
}