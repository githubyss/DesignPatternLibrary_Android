package com.githubyss.design_pattern.test.factory_abstract.vegetable.factory.with_factory_simple

import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber.IVegetableCucumber
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber.VegetableCucumberOrdinary
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber.VegetableCucumberTransgenic
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato.IVegetablePotato
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato.VegetablePotatoOrdinary
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato.VegetablePotatoTransgenic
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato.IVegetableTomato
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato.VegetableTomatoOrdinary
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato.VegetableTomatoTransgenic
import com.githubyss.design_pattern.test.factory_abstract.vegetable.factory.IFactoryVegetable


/**
 * FactoryVegetablePlantWithFactorySimple
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/14 09:48:43
 */
object FactoryVegetablePlantWithFactorySimple : IFactoryVegetable {
    private const val TYPE_ORDINARY = "Ordinary"
    private const val TYPE_TRANSGENIC = "Transgenic"

    private const val type = TYPE_ORDINARY


    override fun createCucumber(): IVegetableCucumber {
        return when (type) {
            TYPE_ORDINARY -> VegetableCucumberOrdinary()
            TYPE_TRANSGENIC -> VegetableCucumberTransgenic()
            else -> throw NullPointerException("db config error.")
        }
    }

    override fun createPotato(): IVegetablePotato {
        return when (type) {
            TYPE_ORDINARY -> VegetablePotatoOrdinary()
            TYPE_TRANSGENIC -> VegetablePotatoTransgenic()
            else -> throw NullPointerException("db config error.")
        }
    }

    override fun createTomato(): IVegetableTomato {
        return when (type) {
            TYPE_ORDINARY -> VegetableTomatoOrdinary()
            TYPE_TRANSGENIC -> VegetableTomatoTransgenic()
            else -> throw NullPointerException("db config error.")
        }
    }
}