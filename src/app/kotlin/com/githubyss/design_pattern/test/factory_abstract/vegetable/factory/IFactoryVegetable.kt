package com.githubyss.design_pattern.test.factory_abstract.vegetable.factory

import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber.IVegetableCucumber
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato.IVegetablePotato
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato.IVegetableTomato


interface IFactoryVegetable {
    fun createCucumber(): IVegetableCucumber
    fun createPotato(): IVegetablePotato
    fun createTomato(): IVegetableTomato
}