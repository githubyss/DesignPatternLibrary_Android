package com.githubyss.design_pattern.test.factory_method.vegetable.factory

import com.githubyss.design_pattern.test.factory_method.vegetable.entity.IVegetable
import com.githubyss.design_pattern.test.factory_method.vegetable.entity.VegetablePotato


class FactoryVegetablePotato : IFactoryVegetable {
    override fun createVegetable(): IVegetable {
        return VegetablePotato()
    }
}