package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.cash.ICashStrategy


interface IFactoryCashStrategy {
    fun create(): ICashStrategy
}