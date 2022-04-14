package com.githubyss.design_pattern.test.factory_abstract.vegetable.factory.with_factory_simple_and_reflect

import com.githubyss.design_pattern.BuildConfig
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.IVegetable
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber.IVegetableCucumber
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato.IVegetablePotato
import com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato.IVegetableTomato
import com.githubyss.design_pattern.test.factory_abstract.vegetable.factory.IFactoryVegetable
import com.githubyss.design_pattern.test.util.createClass


object FactoryVegetablePlantWithFactorySimpleAndReflect : IFactoryVegetable {
    private val PACKAGE_PATH = IVegetable::class.java.packageName

    private const val CLASS_NAME_SUFFIX_VEGETABLE_ORDINARY = "Ordinary"
    private const val CLASS_NAME_SUFFIX_VEGETABLE_TRANSGENIC = "Transgenic"

    private const val CLASS_NAME_PREFIX_ENTITY_CUCUMBER = "cucumber.VegetableCucumber"
    private const val CLASS_NAME_PREFIX_ENTITY_POTATO = "potato.VegetablePotato"
    private const val CLASS_NAME_PREFIX_ENTITY_TOMATO = "tomato.VegetableTomato"

    // private const val classNameSuffixVegetable = CLASS_NAME_SUFFIX_VEGETABLE_ORDINARY
    private const val classNameSuffixVegetable = BuildConfig.classNameSuffixVegetable


    override fun createCucumber(): IVegetableCucumber {
        return try {
            createClass<IVegetableCucumber>(assembleClassName(CLASS_NAME_PREFIX_ENTITY_CUCUMBER))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    override fun createPotato(): IVegetablePotato {
        return try {
            createClass<IVegetablePotato>(assembleClassName(CLASS_NAME_PREFIX_ENTITY_POTATO))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    override fun createTomato(): IVegetableTomato {
        return try {
            createClass<IVegetableTomato>(assembleClassName(CLASS_NAME_PREFIX_ENTITY_TOMATO))
        }
        catch (e: Exception) {
            e.printStackTrace()
            throw Exception("Class name is incorrect.")
        }
    }

    private fun assembleClassName(classNamePrefixEntity: String): String {
        return "$PACKAGE_PATH.$classNamePrefixEntity$classNameSuffixVegetable"
    }
}