package com.githubyss.design_pattern.test.factory_method_reflect

import com.githubyss.design_pattern.factory.FactoryReflect
import com.githubyss.design_pattern.factory.FactoryReflectInline
import com.githubyss.design_pattern.factory.IFactoryReflect
import com.githubyss.design_pattern.test.*
import com.githubyss.design_pattern.test.entity.car.CarJeep
import com.githubyss.design_pattern.test.entity.car.CarSport
import com.githubyss.design_pattern.test.entity.car.ICar
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


fun factoryMethodReflect() {
    println("$PREFIX FactoryMethodReflect 工厂方法模式（反射实现）")
    println()


    val shipCruise: IShip = FactoryReflect<IShip>().create<ShipCruise>(ShipCruise::class.java)
    shipCruise.weighAnchor()
    shipCruise.dropAnchor()

    val shipWar: IShip = FactoryReflect<IShip>().create<ShipWar>(ShipWar::class)
    shipWar.weighAnchor()
    shipWar.dropAnchor()
    (shipWar as ShipWar).launchMissile()
    println()


    val carSport: ICar = FactoryReflectInline<ICar>().create<CarSport>()
    carSport.drive()
    carSport.selfNavigation()

    val carJeep: ICar = FactoryReflectInline<ICar>().create<CarJeep>()
    carJeep.drive()
    carJeep.selfNavigation()
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
}