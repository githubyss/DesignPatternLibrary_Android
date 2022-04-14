package com.githubyss.design_pattern.test.factory_method.vegetable.entity


class VegetablePotato : IVegetable {
    override fun seed() {
        println("草莓:播种")
    }

    override fun grow() {
        println("草莓:生长")
    }

    override fun ripen() {
        println("草莓:成熟")
    }
}