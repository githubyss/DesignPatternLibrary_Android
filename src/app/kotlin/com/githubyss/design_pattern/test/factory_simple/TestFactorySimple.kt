package com.githubyss.design_pattern.test.factory_simple

import com.githubyss.design_pattern.test.MONEY
import com.githubyss.design_pattern.test.POST_NUMBER
import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.PRE_NUMBER
import com.githubyss.design_pattern.test.entity.car.CarType
import com.githubyss.design_pattern.test.entity.car.ICar
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy
import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.leifeng.LeifengType
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorDyadic
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorUnary
import com.githubyss.design_pattern.test.entity.math_operator.OperatorType
import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipType
import com.githubyss.design_pattern.test.entity.ship.ShipWar


fun factorySimple() {
    println("$PREFIX FactorySimple 简单工厂模式")
    println()


    val shipCruise: IShip = FactoryShip.create(ShipType.CRUISE_SHIP)
    shipCruise.weighAnchor()
    shipCruise.dropAnchor()

    val shipWar: IShip = FactoryShip.create(ShipType.WAR_SHIP)
    shipWar.weighAnchor()
    shipWar.dropAnchor()
    (shipWar as ShipWar).launchMissile()
    println()


    val carSport: ICar = FactoryCar.create(CarType.SPORT_CAR)
    carSport.drive()
    carSport.selfNavigation()

    val carJeep: ICar = FactoryCar.create(CarType.JEEP_CAR)
    carJeep.drive()
    carJeep.selfNavigation()
    println()


    val operatorEqu: IOperatorUnary = FactoryOperator.create(OperatorType.EQU) as IOperatorUnary
    val operatorAdd: IOperatorDyadic = FactoryOperator.create(OperatorType.ADD) as IOperatorDyadic
    val operatorSub: IOperatorDyadic = FactoryOperator.create(OperatorType.SUB) as IOperatorDyadic
    val operatorMul: IOperatorDyadic = FactoryOperator.create(OperatorType.MUL) as IOperatorDyadic
    val operatorDiv: IOperatorDyadic = FactoryOperator.create(OperatorType.DIV) as IOperatorDyadic
    println("$PRE_NUMBER ${operatorAdd.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorAdd.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorSub.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorSub.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorMul.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorMul.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorDiv.operator()} $POST_NUMBER ${operatorEqu.operator()} ${operatorDiv.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println()


    val leifengXiaoMing: Leifeng = FactoryLeifeng.create(LeifengType.UNDERGRADUATE)
    val leifengDaBao: Leifeng = FactoryLeifeng.create(LeifengType.UNDERGRADUATE)
    val leifengTuTu: Leifeng = FactoryLeifeng.create(LeifengType.UNDERGRADUATE)
    val leifengLaoDu: Leifeng = FactoryLeifeng.create(LeifengType.VOLUNTEER)
    leifengXiaoMing.sweep()
    leifengDaBao.wash()
    leifengTuTu.buyRice()
    leifengLaoDu.buyRice()
    println()


    val cashStrategyNormal: ICashStrategy = FactoryCash.create("正常收费")
    val cashStrategyRebate: ICashStrategy = FactoryCash.create("打8折")
    val cashStrategyReturn: ICashStrategy = FactoryCash.create("满300返100")
    cashStrategyNormal.acceptCash(MONEY)
    cashStrategyRebate.acceptCash(MONEY)
    cashStrategyReturn.acceptCash(MONEY)
    println()
}
