package com.githubyss.design_pattern.test.proxy

import com.githubyss.design_pattern.test.entity.give_gift.SchoolGirl


fun proxy() {
    println("送礼物")
    val mm = SchoolGirl("美眉")
    val proxy = Proxy("中介")
    proxy.mm = mm
    proxy.giveDolls()
    proxy.giveFlowers()
    proxy.giveChocolate()
    println()
}