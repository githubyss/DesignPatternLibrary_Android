package com.githubyss.design_pattern.test.factory_abstory.vegetable


class VegetableCucumberOrdinary : IVegetableCucumber {
    override fun seed() {
        println("黄瓜:普通:播种")
    }

    override fun grow() {
        println("黄瓜:普通:生长")
    }

    override fun ripen() {
        println("黄瓜:普通:成熟")
    }
}