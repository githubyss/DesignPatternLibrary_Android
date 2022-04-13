package com.githubyss.design_pattern.test.factory_method.fruit


class FactoryVegetableCucumber : IFactoryVegetable {
    override fun createVegetable(): IVegetable {
        return VegetableCucumber()
    }
}