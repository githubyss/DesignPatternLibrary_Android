package com.githubyss.design_pattern.test.entity.cash


interface ICashStrategy {
    fun acceptCash(money: Double): Double
}