package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.*
import com.githubyss.design_pattern.test.entity.car.ICar
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy
import com.githubyss.design_pattern.test.entity.database_operator.Department
import com.githubyss.design_pattern.test.entity.database_operator.IDepartmentOperator
import com.githubyss.design_pattern.test.entity.database_operator.IUserOperator
import com.githubyss.design_pattern.test.entity.database_operator.User
import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorDyadic
import com.githubyss.design_pattern.test.entity.math_operator.IOperatorUnary
import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipWar


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


    var factoryDatabaseOperator: IFactoryDatabaseOperator = FactoryDatabaseOperatorSqlServer()

    var userOperator: IUserOperator = factoryDatabaseOperator.createUserOperator()
    userOperator.insert(User(0, "用户0"))
    userOperator.getUser(0)

    var departmentOperator: IDepartmentOperator = factoryDatabaseOperator.createDepartmentOperator()
    departmentOperator.insert(Department(0, "部门0"))
    departmentOperator.getDepartment(0)

    factoryDatabaseOperator = FactoryDatabaseOperatorAccess()

    userOperator = factoryDatabaseOperator.createUserOperator()
    userOperator.insert(User(0, "用户0"))
    userOperator.getUser(0)

    departmentOperator = factoryDatabaseOperator.createDepartmentOperator()
    departmentOperator.insert(Department(0, "部门0"))
    departmentOperator.getDepartment(0)

    println()
}