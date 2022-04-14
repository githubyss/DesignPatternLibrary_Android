package com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.cucumber


class VegetableCucumberTransgenic : IVegetableCucumber {
    override fun seed() {
        println("黄瓜:转基因:播种")
    }

    override fun grow() {
        println("黄瓜:转基因:生长")
    }

    override fun ripen() {
        println("黄瓜:转基因:成熟")
    }
}