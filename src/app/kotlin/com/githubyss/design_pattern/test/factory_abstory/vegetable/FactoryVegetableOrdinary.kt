package com.githubyss.design_pattern.test.factory_abstory.vegetable


class FactoryVegetableOrdinary : IFactoryVegetable {
    override fun createCucumber(): IVegetableCucumber {
        return VegetableCucumberOrdinary()
    }

    override fun createPotato(): IVegetablePotato {
        return VegetablePotatoOrdinary()
    }

    override fun createTomato(): IVegetableTomato {
        return VegetableTomatoOrdinary()
    }
}