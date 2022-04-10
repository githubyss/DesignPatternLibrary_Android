package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.ship.IShip


interface IFactoryShip {
    fun create(): IShip
}