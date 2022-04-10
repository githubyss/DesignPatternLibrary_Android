package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipWar


object FactoryShipWar : IFactoryShip {
    override fun create(): IShip {
        return ShipWar()
    }
}