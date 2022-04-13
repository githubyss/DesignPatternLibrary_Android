package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.*
import com.githubyss.design_pattern.test.entity.car.ICar
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy
import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorDyadic
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorUnary
import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipWar


/**
 * TestFactoryMethod
 *
 * 使用场景：
 *
 * 特点：
 * - 针对的是一个产品等级结构：蔬菜
 * - 一个抽象产品类：蔬菜
 * - 这个抽象产品类可以派生出多个具体产品类（每个具体产品类的实例由相应的具体工厂类创建（这个具体工厂只有一个生产方法，用来生产对应的具体产品））：根菜、叶菜
 * - 一个抽象工厂类（只有一个生产方法，对应于一个抽象产品类）：种植工厂:生产蔬菜
 * - 这个抽象工厂类可以派生出多个具体工厂类（关心的是具体产品类）：根菜种植工厂、叶菜种植工厂
 * - 每个具体工厂类只能创建一个具体产品类的实例（每个具体工厂对应相应的单一具体产品的创建）：根菜种植工厂生产根菜，叶菜种植工厂生产叶菜
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/13 11:49:32
 */

fun factoryMethod() {
    println("$PREFIX FactoryMethod 工厂方法模式（普通实现）")
    println()


    val shipCruise: IShip = FactoryShipCruise.create()
    shipCruise.weighAnchor()
    shipCruise.dropAnchor()

    val shipWar: IShip = FactoryShipWar.create()
    shipWar.weighAnchor()
    shipWar.dropAnchor()
    (shipWar as ShipWar).launchMissile()
    println()


    val carSport: ICar = FactoryCarSport.create()
    carSport.drive()
    carSport.selfNavigation()

    val carJeep: ICar = FactoryCarJeep.create()
    carJeep.drive()
    carJeep.selfNavigation()
    println()


    val operatorEqu: IOperatorUnary = FactoryOperatorEqu.create() as IOperatorUnary
    val operatorAdd: IOperatorDyadic = FactoryOperatorAdd.create() as IOperatorDyadic
    val operatorSub: IOperatorDyadic = FactoryOperatorSub.create() as IOperatorDyadic
    val operatorMul: IOperatorDyadic = FactoryOperatorMul.create() as IOperatorDyadic
    val operatorDiv: IOperatorDyadic = FactoryOperatorDiv.create() as IOperatorDyadic
    println("$PRE_NUMBER ${operatorAdd.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorAdd.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorSub.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorSub.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorMul.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorMul.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorDiv.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorDiv.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println()


    var factoryLeifeng: IFactoryLeifeng = FactoryLeifengUndergraduate()

    val leifengXiaoMing: Leifeng = factoryLeifeng.create()
    val leifengDaBao: Leifeng = factoryLeifeng.create()
    val leifengTuTu: Leifeng = factoryLeifeng.create()

    factoryLeifeng = FactoryLeifengVolunteer()

    val leifengLaoDu: Leifeng = factoryLeifeng.create()

    leifengXiaoMing.sweep()
    leifengDaBao.wash()
    leifengTuTu.buyRice()
    leifengLaoDu.buyRice()
    println()


    val cashStrategyNormal: ICashStrategy = FactoryCashStrategyNormal().create()
    val cashStrategyRebate: ICashStrategy = FactoryCashStrategyRebate(MONEY_REBATE).create()
    val cashStrategyReturn: ICashStrategy = FactoryCashStrategyReturn(MONEY_CONDITION, MONEY_RETURN).create()

    cashStrategyNormal.acceptCash(MONEY)
    cashStrategyRebate.acceptCash(MONEY)
    cashStrategyReturn.acceptCash(MONEY)
    println()
}