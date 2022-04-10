package com.githubyss.design_pattern.test.factory_simple

import com.githubyss.design_pattern.test.entity.car.CarJeep
import com.githubyss.design_pattern.test.entity.car.CarSport
import com.githubyss.design_pattern.test.entity.car.CarType
import com.githubyss.design_pattern.test.entity.car.ICar


object FactoryCar {
    fun create(type: CarType): ICar {
        return when (type) {
            CarType.SPORT_CAR -> CarSport()
            CarType.JEEP_CAR -> CarJeep()
        }
    }
}
