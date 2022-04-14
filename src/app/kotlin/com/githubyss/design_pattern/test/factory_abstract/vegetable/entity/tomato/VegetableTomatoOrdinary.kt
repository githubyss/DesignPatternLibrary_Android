package com.githubyss.design_pattern.test.factory_abstract.vegetable.entity.tomato


class VegetableTomatoOrdinary : IVegetableTomato {
    override fun seed() {
        println("番茄:普通:播种")
    }

    override fun grow() {
        println("番茄:普通:生长")
    }

    override fun ripen() {
        println("番茄:普通:成熟")
    }
}