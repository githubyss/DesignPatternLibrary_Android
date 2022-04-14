package com.githubyss.design_pattern.test.factory_abstract.vegetable.factory.normal_abstract

import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber.IVegetableCucumber
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber.VegetableCucumberTransgenic
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato.IVegetablePotato
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato.VegetablePotatoTransgenic
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato.IVegetableTomato
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato.VegetableTomatoTransgenic
import com.githubyss.design_pattern.test.factory_abstract.vegetable.factory.IFactoryVegetable


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