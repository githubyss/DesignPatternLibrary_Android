package com.githubyss.design_pattern.test.factory_method

import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipCruise


object FactoryShipCruise : IFactoryShip {
    override fun create(): IShip {
        return ShipCruise()
    }
}