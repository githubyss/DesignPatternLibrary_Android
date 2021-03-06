package com.githubyss.design_pattern.test.strategy

import com.githubyss.design_pattern.test.*
import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn


fun strategy() {
    println("$PREFIX Strategy 策略模式")
    println()


    val strategyCashNormal: StrategyContextCash = StrategyContextCash(CashStrategyNormal())
    val strategyCashRebate: StrategyContextCash = StrategyContextCash(CashStrategyRebate(MONEY_REBATE))
    val strategyCashReturn: StrategyContextCash = StrategyContextCash(CashStrategyReturn(MONEY_CONDITION, MONEY_RETURN))
    strategyCashNormal.acceptCash(MONEY)
    strategyCashRebate.acceptCash(MONEY)
    strategyCashReturn.acceptCash(MONEY)
    println()



    println("$PREFIX Strategy 策略模式 & SimpleFactory 简单工厂模式")
    println()


    val strategyCashNormalWithFactorySimple: StrategyContextCashWithFactorySimple = StrategyContextCashWithFactorySimple("正常收费")
    val strategyCashRebateWithFactorySimple: StrategyContextCashWithFactorySimple = StrategyContextCashWithFactorySimple("打8折")
    val strategyCashReturnWithFactorySimple: StrategyContextCashWithFactorySimple = StrategyContextCashWithFactorySimple("满300返100")
    strategyCashNormalWithFactorySimple.acceptCash(MONEY)
    strategyCashRebateWithFactorySimple.acceptCash(MONEY)
    strategyCashReturnWithFactorySimple.acceptCash(MONEY)
    println()



    println("$PREFIX Strategy 策略模式 & FactoryMethodReflect 工厂方法模式（反射实现）")
    println()


    StrategyContextCashWithFactoryMethodReflect.acceptCash<CashStrategyNormal>(money = MONEY)
    StrategyContextCashWithFactoryMethodReflect.acceptCash<CashStrategyRebate>(money = MONEY, moneyRebate = MONEY_REBATE)
    StrategyContextCashWithFactoryMethodReflect.acceptCash<CashStrategyReturn>(money = MONEY, moneyCondition = MONEY_CONDITION, moneyReturn = MONEY_RETURN)
    println()
}