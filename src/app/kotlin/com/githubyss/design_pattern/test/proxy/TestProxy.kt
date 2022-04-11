package com.githubyss.design_pattern.test.proxy

import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.proxy.give_gift.SchoolGirl


fun proxy() {
    println("$PREFIX Proxy 代理模式")
    println()

    println("送礼物")
    val mm = SchoolGirl("美眉")
    val proxy = Proxy("中介")
    proxy.mm = mm
    proxy.giveDolls()
    proxy.giveFlowers()
    proxy.giveChocolate()
    println()
}