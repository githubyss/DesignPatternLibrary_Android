package com.githubyss.design_pattern.test.factory_method.fruit


class VegetableTomato : IVegetable {
    override fun seed() {
        println("香蕉:播种")
    }

    override fun grow() {
        println("香蕉:生长")
    }

    override fun ripen() {
        println("香蕉:成熟")
    }
}