package com.githubyss.design_pattern.test.strategy

import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn


fun strategy() {
    println("$PREFIX Strategy 策略模式")
    println()

    val money: Double = 1000.0
    val moneyRebate: Double = 0.8
    val moneyCondition: Double = 300.0
    val moneyReturn: Double = 100.0

    val strategyCashNormal: StrategyContextCash = StrategyContextCash(CashStrategyNormal())
    val strategyCashRebate: StrategyContextCash = StrategyContextCash(CashStrategyRebate(moneyRebate))
    val strategyCashReturn: StrategyContextCash = StrategyContextCash(CashStrategyReturn(moneyCondition, moneyReturn))
    strategyCashNormal.acceptCash(money)
    strategyCashRebate.acceptCash(money)
    strategyCashReturn.acceptCash(money)
    println()

    println("$PREFIX Strategy 策略模式 & SimpleFactory 简单工厂模式")
    println()

    val strategyCashNormalFactorySimple: StrategyContextCashFactorySimple = StrategyContextCashFactorySimple("正常收费")
    val strategyCashRebateFactorySimple: StrategyContextCashFactorySimple = StrategyContextCashFactorySimple("打8折")
    val strategyCashReturnFactorySimple: StrategyContextCashFactorySimple = StrategyContextCashFactorySimple("满300返100")
    strategyCashNormalFactorySimple.acceptCash(money)
    strategyCashRebateFactorySimple.acceptCash(money)
    strategyCashReturnFactorySimple.acceptCash(money)
    println()

    println("$PREFIX Strategy 策略模式 & AbstractFactory 抽象工厂模式")
    println()

    StrategyContextCashFactoryAbstract.acceptCash<CashStrategyNormal>(money = money)
    StrategyContextCashFactoryAbstract.acceptCash<CashStrategyRebate>(money = money, moneyRebate = moneyRebate)
    StrategyContextCashFactoryAbstract.acceptCash<CashStrategyReturn>(money = money, moneyCondition = moneyCondition, moneyReturn = moneyReturn)
    println()
}