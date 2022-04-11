package com.githubyss.design_pattern.observer.by_interface


abstract class SubjectAbstractByInterface {
    private val observers: ArrayList<IObserver> = ArrayList<IObserver>()

    abstract var state: String

    fun attach(observer: IObserver) {
        observers.add(observer)
    }

    fun detach(observer: IObserver) {
        observers.remove(observer)
    }

    fun tell() {
        observers.forEach {
            it.update()
        }
    }
}