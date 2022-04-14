package com.githubyss.design_pattern.test.factory_method.vegetable.entity


class VegetableCucumber : IVegetable {
    override fun seed() {
        println("西瓜:播种")
    }

    override fun grow() {
        println("西瓜:生长")
    }

    override fun ripen() {
        println("西瓜:成熟")
    }
}