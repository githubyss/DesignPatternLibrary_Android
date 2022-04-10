package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.car.CarSport
import com.githubyss.design_pattern.test.entity.car.ICar


object FactoryCarSport : IFactoryCar {
    override fun create(): ICar {
        return CarSport()
    }
}