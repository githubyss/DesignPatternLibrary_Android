package com.githubyss.design_pattern.test.observer.boss_monitor


class SubjectSecretary(name: String) : SubjectAbstractWithName(name) {
    // 观察者列表
    private val observers: ArrayList<ObserverAbstractWithName> = ArrayList<ObserverAbstractWithName>()

    // 前台通过电话，说的话或做的事
    var action: String = ""

    override var state: String
        get() = action
        set(value) {
            action = value
        }

    /**
     * 有几个员工请前台帮忙，就给列表增加几个对象。
     */
    override fun attach(observer: ObserverAbstractWithName) {
        /** 针对抽象编程，降低具体类的耦合 */
        observers.add(observer)
    }

    override fun detach(observer: ObserverAbstractWithName) {
        observers.remove(observer)
    }

    /**
     * 待老板来了，给所有登记过的员工发通知，“老板来了”
     */
    override fun tell() {
        observers.forEach {
            it.update()
        }
    }
}