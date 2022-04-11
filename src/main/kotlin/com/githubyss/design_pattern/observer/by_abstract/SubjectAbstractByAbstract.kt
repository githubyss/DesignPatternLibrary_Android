package com.githubyss.design_pattern.observer.by_abstract


abstract class SubjectAbstractByAbstract {
    private val observers: ArrayList<ObserverAbstract> = ArrayList<ObserverAbstract>()

    abstract var state: String

    fun attach(observer: ObserverAbstract) {
        observers.add(observer)
    }

    fun detach(observer: ObserverAbstract) {
        observers.remove(observer)
    }

    fun tell() {
        observers.forEach {
            it.update()
        }
    }
}