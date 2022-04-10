package com.githubyss.design_pattern.test.entity.ship


sealed class ShipType {
    object CRUISE_SHIP : ShipType()
    object WAR_SHIP : ShipType()
}