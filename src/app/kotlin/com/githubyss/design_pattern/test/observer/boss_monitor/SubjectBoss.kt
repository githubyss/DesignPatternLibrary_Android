package com.githubyss.design_pattern.test.observer.boss_monitor

class SubjectBoss(name: String) : SubjectAbstractWithName(name) {
    // 观察者列表
    private val observers: ArrayList<ObserverAbstractWithName> = ArrayList<ObserverAbstractWithName>()

    var action: String = ""

    override var state: String
        get() = action
        set(value) {
            action = value
        }

    override fun attach(observer: ObserverAbstractWithName) {
        observers.add(observer)
    }

    override fun detach(observer: ObserverAbstractWithName) {
        observers.remove(observer)
    }

    override fun tell() {
        observers.forEach {
            it.update()
        }
    }
}