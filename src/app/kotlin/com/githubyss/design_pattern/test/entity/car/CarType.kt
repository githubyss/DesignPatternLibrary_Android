package com.githubyss.design_pattern.test.entity.car


sealed class CarType {
    object SPORT_CAR : CarType()
    object JEEP_CAR : CarType()
}