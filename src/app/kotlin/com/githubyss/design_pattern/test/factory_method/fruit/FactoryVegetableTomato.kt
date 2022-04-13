package com.githubyss.design_pattern.test.factory_method.fruit


class FactoryVegetableTomato : IFactoryVegetable {
    override fun createVegetable(): IVegetable {
        return VegetableTomato()
    }
}