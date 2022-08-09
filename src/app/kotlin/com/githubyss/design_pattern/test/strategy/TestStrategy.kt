package com.githubyss.design_pattern.test.strategy

import com.githubyss.design_pattern.test.*
import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn
import com.githubyss.design_pattern.test.strategy.cash.StrategyContextCash
import com.githubyss.design_pattern.test.strategy.cash.StrategyContextCashWithFactoryMethodReflect
import com.githubyss.design_pattern.test.strategy.cash.StrategyContextCashWithFactorySimple
import com.githubyss.design_pattern.test.strategy.encode.DataEncode
import com.githubyss.design_pattern.test.strategy.encode.DataEncodeBySharp
import com.githubyss.design_pattern.test.strategy.encode.DataEncodeByStar


fun strategy() {
    println("$PREFIX Strategy 策略模式")
    println()

    val strategyCashNormal = StrategyContextCash(CashStrategyNormal())
    val strategyCashRebate = StrategyContextCash(CashStrategyRebate(MONEY_REBATE))
    val strategyCashReturn = StrategyContextCash(CashStrategyReturn(MONEY_CONDITION, MONEY_RETURN))
    println("消费:${strategyCashNormal.acceptCash(MONEY)}")
    println("消费:${strategyCashRebate.acceptCash(MONEY)}")
    println("消费:${strategyCashReturn.acceptCash(MONEY)}")
    println()



    println("$PREFIX Strategy 策略模式 & SimpleFactory 简单工厂模式")
    println()

    val strategyCashNormalWithFactorySimple = StrategyContextCashWithFactorySimple("正常收费")
    val strategyCashRebateWithFactorySimple = StrategyContextCashWithFactorySimple("打8折")
    val strategyCashReturnWithFactorySimple = StrategyContextCashWithFactorySimple("满300返100")
    println("消费:${strategyCashNormalWithFactorySimple.acceptCash(MONEY)}")
    println("消费:${strategyCashRebateWithFactorySimple.acceptCash(MONEY)}")
    println("消费:${strategyCashReturnWithFactorySimple.acceptCash(MONEY)}")
    println()



    println("$PREFIX Strategy 策略模式 & FactoryMethodReflect 工厂方法模式（反射实现）")
    println()

    println("消费:${StrategyContextCashWithFactoryMethodReflect.acceptCash<CashStrategyNormal>(money = MONEY)}")
    println("消费:${StrategyContextCashWithFactoryMethodReflect.acceptCash<CashStrategyRebate>(money = MONEY, moneyRebate = MONEY_REBATE)}")
    println("消费:${StrategyContextCashWithFactoryMethodReflect.acceptCash<CashStrategyReturn>(money = MONEY, moneyCondition = MONEY_CONDITION, moneyReturn = MONEY_RETURN)}")
    println()

    println("编码:${DataEncode.encode<DataEncodeByStar>("data")}")
    println("编码:${DataEncode.encode<DataEncodeBySharp>("data")}")
    println()
}
