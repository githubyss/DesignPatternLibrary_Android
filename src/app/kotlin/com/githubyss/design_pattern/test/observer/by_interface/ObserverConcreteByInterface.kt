package com.githubyss.design_pattern.test.observer.by_interface

import com.githubyss.design_pattern.observer.by_interface.IObserver
import com.githubyss.design_pattern.observer.by_interface.SubjectAbstractByInterface


class ObserverConcreteByInterface(private val name: String, private val subject: SubjectAbstractByInterface) : IObserver {
    override fun update() {
        println("观察者${name}的新状态：${subject.state}")
    }
}