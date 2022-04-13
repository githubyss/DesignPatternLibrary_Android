package com.githubyss.design_pattern.test.factory_abstory.vegetable


class VegetableTomatoTransgenic : IVegetableTomato {
    override fun seed() {
        println("番茄:转基因:播种")
    }

    override fun grow() {
        println("番茄:转基因:生长")
    }

    override fun ripen() {
        println("番茄:转基因:成熟")
    }
}