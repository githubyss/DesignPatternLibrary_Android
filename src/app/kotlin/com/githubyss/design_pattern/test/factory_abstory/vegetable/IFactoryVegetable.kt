package com.githubyss.design_pattern.test.factory_abstory.vegetable


interface IFactoryVegetable {
    fun createCucumber(): IVegetableCucumber
    fun createPotato(): IVegetablePotato
    fun createTomato(): IVegetableTomato
}