package com.githubyss.design_pattern.test.factory_method.vegetable.factory

import com.githubyss.design_pattern.test.factory_method.vegetable.entity.IVegetable
import com.githubyss.design_pattern.test.factory_method.vegetable.entity.VegetableTomato


class FactoryVegetableTomato : IFactoryVegetable {
    override fun createVegetable(): IVegetable {
        return VegetableTomato()
    }
}