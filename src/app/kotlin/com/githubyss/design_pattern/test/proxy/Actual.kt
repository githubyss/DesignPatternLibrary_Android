package com.githubyss.design_pattern.test.proxy

import com.githubyss.design_pattern.test.entity.give_gift.IGiveGift
import com.githubyss.design_pattern.test.entity.give_gift.SchoolGirl


data class Actual(var name: String) : IGiveGift {
    var mm: SchoolGirl? = null

    override fun giveDolls() {
        println("${name}：${mm?.name}，送你洋娃娃")
    }

    override fun giveFlowers() {
        println("${name}：${mm?.name}，送你鲜花")
    }

    override fun giveChocolate() {
        println("${name}：${mm?.name}，送你巧克力")
    }
}