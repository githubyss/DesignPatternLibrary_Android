package com.githubyss.design_pattern.test.factory_method.vegetable.factory

import com.githubyss.design_pattern.test.factory_method.vegetable.entity.IVegetable


interface IFactoryVegetable {
    fun createVegetable(): IVegetable
}