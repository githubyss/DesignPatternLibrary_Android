package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.car.CarJeep
import com.githubyss.design_pattern.test.entity.car.ICar


object FactoryCarJeep : IFactoryCar {
    override fun create(): ICar {
        return CarJeep()
    }
}