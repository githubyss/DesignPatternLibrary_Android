package com.githubyss.design_pattern.test.proxy

import com.githubyss.design_pattern.test.entity.give_gift.IGiveGift
import com.githubyss.design_pattern.test.entity.give_gift.SchoolGirl


data class Proxy(var name: String) : IGiveGift {
    var mm: SchoolGirl? = null
        set(value) {
            field = value
            gg?.mm = field
        }

    var gg: Actual? = null

    init {
        gg = Actual("葛格")
    }

    override fun giveDolls() {
        gg?.giveDolls()
    }

    override fun giveFlowers() {
        gg?.giveFlowers()
    }

    override fun giveChocolate() {
        gg?.giveChocolate()
    }
}