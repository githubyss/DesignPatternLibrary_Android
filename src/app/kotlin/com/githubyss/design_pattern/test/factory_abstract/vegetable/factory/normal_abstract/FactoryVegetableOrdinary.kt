package com.githubyss.design_pattern.test.factory_abstract.vegetable.factory.normal_abstract

import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber.IVegetableCucumber
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber.VegetableCucumberOrdinary
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato.IVegetablePotato
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato.VegetablePotatoOrdinary
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato.IVegetableTomato
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato.VegetableTomatoOrdinary
import com.githubyss.design_pattern.test.factory_abstract.vegetable.factory.IFactoryVegetable


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