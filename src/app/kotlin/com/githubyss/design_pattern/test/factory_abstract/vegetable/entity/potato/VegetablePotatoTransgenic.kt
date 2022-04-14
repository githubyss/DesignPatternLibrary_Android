package com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.potato


class VegetablePotatoTransgenic : IVegetablePotato {
    override fun seed() {
        println("土豆:转基因:播种")
    }

    override fun grow() {
        println("土豆:转基因:生长")
    }

    override fun ripen() {
        println("土豆:转基因:成熟")
    }
}