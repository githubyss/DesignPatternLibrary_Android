package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.car.ICar


interface IFactoryCar {
    fun create(): ICar
}