package com.githubyss.design_pattern.test.factory_abstory.vegetable


class VegetablePotatoOrdinary : IVegetablePotato {
    override fun seed() {
        println("土豆:普通:播种")
    }

    override fun grow() {
        println("土豆:普通:生长")
    }

    override fun ripen() {
        println("土豆:普通:成熟")
    }
}