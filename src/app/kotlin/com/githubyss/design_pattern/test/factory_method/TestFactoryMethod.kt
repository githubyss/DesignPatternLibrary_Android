package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.POST_NUMBER
import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.PRE_NUMBER
import com.githubyss.design_pattern.test.entity.car.ICar
import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorDyadic
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorUnary
import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipWar


fun factoryMethod() {
    println("$PREFIX FactoryMethod 工厂方法模式")
    println()

    val shipCruise: IShip = FactoryShipCruise.create()
    val shipWar: IShip = FactoryShipWar.create()
    shipCruise.weighAnchor()
    shipCruise.dropAnchor()
    shipWar.weighAnchor()
    shipWar.dropAnchor()
    (shipWar as ShipWar).launchMissile()
    println()

    val carSport: ICar = FactoryCarSport.create()
    val carJeep: ICar = FactoryCarJeep.create()
    carSport.drive()
    carSport.selfNavigation()
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

    val leifeng1: Leifeng = FactoryLeifengUndergraduate.create()
    val leifeng2: Leifeng = FactoryLeifengUndergraduate.create()
    val leifeng3: Leifeng = FactoryLeifengUndergraduate.create()
    val leifeng4: Leifeng = FactoryLeifengVolunteer.create()
    leifeng1.sweep()
    leifeng2.wash()
    leifeng3.buyRice()
    leifeng4.buyRice()
    println()
}