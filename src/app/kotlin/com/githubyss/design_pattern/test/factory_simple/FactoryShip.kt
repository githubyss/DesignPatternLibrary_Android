package com.githubyss.design_pattern.test.factory_simple

import com.githubyss.design_pattern.test.entity.ship.IShip
import com.githubyss.design_pattern.test.entity.ship.ShipCruise
import com.githubyss.design_pattern.test.entity.ship.ShipType
import com.githubyss.design_pattern.test.entity.ship.ShipWar


object FactoryShip {
    fun create(type: ShipType): IShip {
        return when (type) {
            ShipType.CRUISE_SHIP -> ShipCruise()
            ShipType.WAR_SHIP -> ShipWar()
        }
    }
}
