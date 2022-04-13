package com.githubyss.design_pattern.test.factory_method.fruit


class FactoryVegetablePotato : IFactoryVegetable {
    override fun createVegetable(): IVegetable {
        return VegetablePotato()
    }
}