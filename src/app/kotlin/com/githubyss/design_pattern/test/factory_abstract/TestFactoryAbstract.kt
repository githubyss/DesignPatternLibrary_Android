package com.githubyss.design_pattern.test.factory_abstract

import com.githubyss.design_pattern.factory_abstract.FactoryConcrete
import com.githubyss.design_pattern.factory_abstract.FactoryConcreteInline
import com.githubyss.design_pattern.factory_abstract.IFactory
import com.githubyss.design_pattern.test.*
import com.githubyss.design_pattern.test.entity.car.CarJeep
import com.githubyss.design_pattern.test.entity.car.CarSport
import com.githubyss.design_pattern.test.entity.car.ICar
import com.githubyss.design_pattern.test.entity.cash.CashStrategyNormal
import com.githubyss.design_pattern.test.entity.cash.CashStrategyRebate
import com.githubyss.design_pattern.test.entity.cash.CashStrategyReturn
import com.githubyss.design_pattern.test.entity.cash.ICashStrategy
import com.githubyss.design_pattern.test.entity.database_operator.*
import com.githubyss.design_pattern.test.entity.leifeng.Leifeng
import com.githubyss.design_pattern.test.entity.leifeng.LeifengUndergraduate
import com.githubyss.design_pattern.test.entity.leifeng.LeifengVolunteer
import com.githubyss.design_pattern.test.entity.math_operator.*
import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipCruise
import com.githubyss.design_pattern.test.entity.ship.ShipWar


fun factoryAbstract() {
    println("$PREFIX FactoryAbstract 抽象工厂模式")
    println()


    val shipCruise: IShip = FactoryConcrete<IShip>().create<ShipCruise>(ShipCruise::class.java)
    shipCruise.weighAnchor()
    shipCruise.dropAnchor()

    val shipWar: IShip = FactoryConcrete<IShip>().create<ShipWar>(ShipWar::class)
    shipWar.weighAnchor()
    shipWar.dropAnchor()
    (shipWar as ShipWar).launchMissile()
    println()


    val carSport: ICar = FactoryConcreteInline<ICar>().create<CarSport>()
    carSport.drive()
    carSport.selfNavigation()

    val carJeep: ICar = FactoryConcreteInline<ICar>().create<CarJeep>()
    carJeep.drive()
    carJeep.selfNavigation()
    println()


    val factoryOperatorUnary: FactoryConcreteInline<IOperatorUnary> = FactoryConcreteInline<IOperatorUnary>()
    val factoryOperatorDyadic: FactoryConcreteInline<IOperatorDyadic> = FactoryConcreteInline<IOperatorDyadic>()

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


    val factoryLeifeng: FactoryConcreteInline<Leifeng> = FactoryConcreteInline<Leifeng>()

    val leifengXiaoMing: Leifeng = factoryLeifeng.create<LeifengUndergraduate>()
    val leifengDaBao: Leifeng = factoryLeifeng.create<LeifengUndergraduate>()
    val leifengTuTu: Leifeng = factoryLeifeng.create<LeifengUndergraduate>()
    val leifengLaoDu: Leifeng = factoryLeifeng.create<LeifengVolunteer>()

    leifengXiaoMing.sweep()
    leifengDaBao.wash()
    leifengTuTu.buyRice()
    leifengLaoDu.buyRice()
    println()


    val factoryCashStrategy: IFactory<ICashStrategy> = FactoryConcrete<ICashStrategy>()
    val cashStrategyNormal: ICashStrategy = factoryCashStrategy.create<CashStrategyNormal>(CashStrategyNormal::class)
    val cashStrategyRebate: ICashStrategy = factoryCashStrategy.create<CashStrategyRebate>(CashStrategyRebate::class, MONEY_REBATE)
    val cashStrategyReturn: ICashStrategy = factoryCashStrategy.create<CashStrategyReturn>(CashStrategyReturn::class, MONEY_CONDITION, MONEY_RETURN)

    cashStrategyNormal.acceptCash(MONEY)
    cashStrategyRebate.acceptCash(MONEY)
    cashStrategyReturn.acceptCash(MONEY)
    println()


    val factoryUserOperator: IFactory<IUserOperator> = FactoryConcrete<IUserOperator>()

    var userOperator: IUserOperator = factoryUserOperator.create<UserOperatorSqlServer>(UserOperatorSqlServer::class)
    userOperator.insert(User(0, "用户0"))
    userOperator.getUser(0)

    userOperator = factoryUserOperator.create<UserOperatorAccess>(UserOperatorAccess::class)
    userOperator.insert(User(0, "用户0"))
    userOperator.getUser(0)

    val factoryDepartmentOperator: IFactory<IDepartmentOperator> = FactoryConcrete<IDepartmentOperator>()

    var departmentOperator: IDepartmentOperator = factoryDepartmentOperator.create<DepartmentOperatorSqlServer>(DepartmentOperatorSqlServer::class)
    departmentOperator.insert(Department(0, "部门0"))
    departmentOperator.getDepartment(0)

    departmentOperator = factoryDepartmentOperator.create<DepartmentOperatorAccess>(DepartmentOperatorAccess::class)
    departmentOperator.insert(Department(0, "部门0"))
    departmentOperator.getDepartment(0)
    println()
}