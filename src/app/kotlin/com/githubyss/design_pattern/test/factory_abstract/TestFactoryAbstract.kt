package com.githubyss.design_pattern.test.factory_abstract

import com.githubyss.design_pattern.factory_abstract.FactoryAbstract
import com.githubyss.design_pattern.factory_abstract.FactoryConcrete
import com.githubyss.design_pattern.factory_abstract.FactoryConcreteInline
import com.githubyss.design_pattern.test.POST_NUMBER
import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.PRE_NUMBER
import com.githubyss.design_pattern.test.entity.car.CarJeep
import com.githubyss.design_pattern.test.entity.car.CarSport
import com.githubyss.design_pattern.test.entity.car.ICar
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


    val shipFactory: FactoryAbstract<IShip> = FactoryConcrete<IShip>()

    val shipCruise: IShip? = shipFactory.create<ShipCruise>(ShipCruise::class.java)
    shipCruise?.let {
        shipCruise.weighAnchor()
        shipCruise.dropAnchor()
    }

    val shipWar: IShip? = shipFactory.create<ShipWar>(ShipWar::class)
    shipWar?.let {
        shipWar.weighAnchor()
        shipWar.dropAnchor()
        (shipWar as ShipWar).launchMissile()
    }
    println()


    val carFactory: FactoryConcreteInline<ICar> = FactoryConcreteInline<ICar>()

    val carSport: ICar? = carFactory.create<CarSport>()
    carSport?.let {
        carSport.drive()
        carSport.selfNavigation()
    }

    val carJeep: ICar? = carFactory.create<CarJeep>()
    carJeep?.let {
        carJeep.drive()
        carJeep.selfNavigation()
    }
    println()


    val operatorUnaryFactory: FactoryConcreteInline<IOperatorUnary> = FactoryConcreteInline<IOperatorUnary>()
    val operatorEqu: IOperatorUnary? = operatorUnaryFactory.create<OperatorEqu>()

    val operatorDyadicFactory: FactoryConcreteInline<IOperatorDyadic> = FactoryConcreteInline<IOperatorDyadic>()
    val operatorAdd: IOperatorDyadic? = operatorDyadicFactory.create<OperatorAdd>()
    val operatorSub: IOperatorDyadic? = operatorDyadicFactory.create<OperatorSub>()
    val operatorMul: IOperatorDyadic? = operatorDyadicFactory.create<OperatorMul>()
    val operatorDiv: IOperatorDyadic? = operatorDyadicFactory.create<OperatorDiv>()

    println("$PRE_NUMBER ${operatorAdd?.operator()} $POST_NUMBER ${operatorEqu?.operator()} ${operatorAdd?.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorSub?.operator()} $POST_NUMBER ${operatorEqu?.operator()} ${operatorSub?.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorMul?.operator()} $POST_NUMBER ${operatorEqu?.operator()} ${operatorMul?.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println("$PRE_NUMBER ${operatorDiv?.operator()} $POST_NUMBER ${operatorEqu?.operator()} ${operatorDiv?.calculate(PRE_NUMBER, POST_NUMBER)}}")
    println()


    val leifengFactory: FactoryConcreteInline<Leifeng> = FactoryConcreteInline<Leifeng>()

    val leifeng1: Leifeng? = leifengFactory.create<LeifengUndergraduate>()
    val leifeng2: Leifeng? = leifengFactory.create<LeifengUndergraduate>()
    val leifeng3: Leifeng? = leifengFactory.create<LeifengUndergraduate>()
    val leifeng4: Leifeng? = leifengFactory.create<LeifengVolunteer>()
    leifeng1?.sweep()
    leifeng2?.wash()
    leifeng3?.buyRice()
    leifeng4?.buyRice()
    println()
}