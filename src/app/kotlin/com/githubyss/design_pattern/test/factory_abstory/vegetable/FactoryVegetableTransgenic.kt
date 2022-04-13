package com.githubyss.design_pattern.test.factory_abstory.vegetable


class FactoryVegetableTransgenic : IFactoryVegetable {
    override fun createCucumber(): IVegetableCucumber {
        return VegetableCucumberTransgenic()
    }

    override fun createPotato(): IVegetablePotato {
        return VegetablePotatoTransgenic()
    }

    override fun createTomato(): IVegetableTomato {
        return VegetableTomatoTransgenic()
    }
}