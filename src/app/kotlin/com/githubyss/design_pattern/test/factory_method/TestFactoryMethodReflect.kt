package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.factory.*
import com.githubyss.design_pattern.test.*
import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy
import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.leifeng.LeifengUndergraduate
import com.githubyss.design_pattern.test.entity.leifeng.LeifengVolunteer
import com.githubyss.design_pattern.test.entity.math_operator.*
import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipCruise
import com.githubyss.design_pattern.test.entity.ship.ShipWar
import com.githubyss.design_pattern.test.factory_method.vegetable.entity.IVegetable
import com.githubyss.design_pattern.test.factory_method.vegetable.entity.VegetableCucumber
import com.githubyss.design_pattern.test.factory_method.vegetable.entity.VegetablePotato
import com.githubyss.design_pattern.test.factory_method.vegetable.entity.VegetableTomato


fun factoryMethodReflect() {
    println("$PREFIX FactoryMethodReflect 工厂方法模式（Reflect）（对于具体类 Something，需要传入泛型 Something，并且需要传入它的 Class 实例 Something::class.java）")
    println()

    val shipCruise = FactoryReflect<IShip>().create<ShipCruise>(ShipCruise::class.java)
    shipCruise.weighAnchor()
    shipCruise.dropAnchor()

    val shipWar = FactoryReflect<IShip>().create<ShipWar>(ShipWar::class)
    shipWar.weighAnchor()
    shipWar.dropAnchor()
    shipWar.launchMissile()
    println()



    println("$PREFIX FactoryMethodReflect 工厂方法模式（Reflect + Inline）（对于具体类 Something，传入泛型 Something）")
    println()

    val shipCruiseInline = FactoryReflectInline<IShip>().create<ShipCruise>()
    shipCruiseInline.weighAnchor()
    shipCruiseInline.dropAnchor()

    val shipWarInline = FactoryReflectInline<ShipWar>().create<ShipWar>()
    shipWarInline.weighAnchor()
    shipWarInline.dropAnchor()
    shipWarInline.launchMissile()
    println()



    println("$PREFIX FactoryMethodReflect 工厂方法模式（Reflect + Inline + Singleton）（对于具体类 Something，传入泛型 Something）")
    println()

    val shipCruiseInlineSingleton = FactoryReflectInlineSingleton.create<ShipCruise>()
    shipCruiseInlineSingleton.weighAnchor()
    shipCruiseInlineSingleton.dropAnchor()

    val shipWarInlineSingleton = FactoryReflectInlineSingleton.create<ShipWar>()
    shipWarInlineSingleton.weighAnchor()
    shipWarInlineSingleton.dropAnchor()
    shipWarInlineSingleton.launchMissile()
    println()



    println("$PREFIX FactoryMethodReflect 工厂方法模式（Reflect + Inline + 顶层方法）（对于具体类 Something，传入泛型 Something）")
    println()

    val shipCruiseInlineExt = create<ShipCruise>()
    shipCruiseInlineExt.weighAnchor()
    shipCruiseInlineExt.dropAnchor()

    val shipWarInlineExt = create<ShipWar>()
    shipWarInlineExt.weighAnchor()
    shipWarInlineExt.dropAnchor()
    shipWarInlineExt.launchMissile()
    println()



    println("$PREFIX FactoryMethodReflect 工厂方法模式（其他实现示例）")
    println()

    val factoryOperatorUnary: FactoryReflectInline<IOperatorUnary> = FactoryReflectInline<IOperatorUnary>()
    val factoryOperatorDyadic: FactoryReflectInline<IOperatorDyadic> = FactoryReflectInline<IOperatorDyadic>()

    val operatorEqu: IOperatorUnary = factoryOperatorUnary.create<OperatorEqu>()
    val operatorAdd: IOperatorDyadic = factoryOperatorDyadic.create<OperatorAdd>()
    val operatorSub: IOperatorDyadic = factoryOperatorDyadic.create<OperatorSub>()
    val operatorMul: IOperatorDyadic = factoryOperatorDyadic.create<OperatorMul>()
    val operatorDiv: IOperatorDyadic = factoryOperatorDyadic.create<OperatorDiv>()

    println("$PRE_NUMBER ${operatorAdd.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorAdd.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorSub.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorSub.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorMul.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorMul.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorDiv.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorDiv.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println()


    val factoryLeifeng: FactoryReflectInline<Leifeng> = FactoryReflectInline<Leifeng>()

    val leifengXiaoMing: Leifeng = factoryLeifeng.create<LeifengUndergraduate>()
    val leifengDaBao: Leifeng = factoryLeifeng.create<LeifengUndergraduate>()
    val leifengTuTu: Leifeng = factoryLeifeng.create<LeifengUndergraduate>()
    val leifengLaoDu: Leifeng = factoryLeifeng.create<LeifengVolunteer>()

    leifengXiaoMing.sweep()
    leifengDaBao.wash()
    leifengTuTu.buyRice()
    leifengLaoDu.buyRice()
    println()


    val factoryCashStrategy: IFactoryReflect<ICashStrategy> = FactoryReflect<ICashStrategy>()
    val cashStrategyNormal: ICashStrategy = factoryCashStrategy.create<CashStrategyNormal>(CashStrategyNormal::class)
    val cashStrategyRebate: ICashStrategy = factoryCashStrategy.create<CashStrategyRebate>(CashStrategyRebate::class, MONEY_REBATE)
    val cashStrategyReturn: ICashStrategy = factoryCashStrategy.create<CashStrategyReturn>(CashStrategyReturn::class, MONEY_CONDITION, MONEY_RETURN)

    cashStrategyNormal.acceptCash(MONEY)
    cashStrategyRebate.acceptCash(MONEY)
    cashStrategyReturn.acceptCash(MONEY)
    println()


    val vegetableCucumber: IVegetable = FactoryReflectInline<IVegetable>().create<VegetableCucumber>()
    vegetableCucumber.seed()
    vegetableCucumber.grow()
    vegetableCucumber.ripen()

    val vegetablePotato: IVegetable = FactoryReflectInline<IVegetable>().create<VegetablePotato>()
    vegetablePotato.seed()
    vegetablePotato.grow()
    vegetablePotato.ripen()

    val vegetableTomato: IVegetable = FactoryReflectInline<IVegetable>().create<VegetableTomato>()
    vegetableTomato.seed()
    vegetableTomato.grow()
    vegetableTomato.ripen()
    println()
}