package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.*
import com.githubyss.design_pattern.test.entity.car.ICar
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy
import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorDyadic
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorUnary
import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipWar
import com.githubyss.design_pattern.test.factory_method.vegetable.entity.IVegetable
import com.githubyss.design_pattern.test.factory_method.vegetable.factory.FactoryVegetableCucumber
import com.githubyss.design_pattern.test.factory_method.vegetable.factory.FactoryVegetablePotato
import com.githubyss.design_pattern.test.factory_method.vegetable.factory.FactoryVegetableTomato


/**
 * TestFactoryMethod
 *
 * 使用场景：
 *
 * 特点：
 * - 针对的是一个产品等级结构。
 * - 一个抽象产品类。
 * - 这个抽象产品类可以派生出多个具体产品类（这个抽象产品类的每个具体产品类的实例由每个具体产品类对应的具体工厂类创建）。
 * - 一个抽象工厂类（只有一个生产方法，对应一个抽象产品类）。
 * - 这个抽象工厂类可以派生出多个具体工厂类（关心的是具体产品类，有几个具体产品类，就有几个具体工厂类，而工厂内部的生产方法对应这个具体产品类）。
 * - 每个具体工厂类只能创建一个具体产品类的实例（每个具体工厂对应某个具体产品类的具体产品的创建）。
 *
 * 举例：
 * - 一个抽象产品类：水果。
 * - 这个抽象产品类可以派生出三个具体产品类：香蕉、草莓、西瓜。
 * - 一个抽象工厂类，有一个生产方法，对应指定的一个抽象产品类：种植工厂:生产水果。
 * - 这个抽象工厂类可以派生出三个具体工厂类：种植工厂->香蕉种植工厂、草莓种植工厂、西瓜种植工厂。
 * - 每个具体工厂类，有一个声唱方法，总共可以创建三个具体产品类的实例：香蕉种植工厂:生产水果，草莓种植工厂:生产水果，西瓜种植工厂:生产水果。
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


    val vegetableCucumber: IVegetable = FactoryVegetableCucumber().createVegetable()
    vegetableCucumber.seed()
    vegetableCucumber.grow()
    vegetableCucumber.ripen()

    val vegetablePotato: IVegetable = FactoryVegetablePotato().createVegetable()
    vegetablePotato.seed()
    vegetablePotato.grow()
    vegetablePotato.ripen()

    val vegetableTomato: IVegetable = FactoryVegetableTomato().createVegetable()
    vegetableTomato.seed()
    vegetableTomato.grow()
    vegetableTomato.ripen()
    println()
}