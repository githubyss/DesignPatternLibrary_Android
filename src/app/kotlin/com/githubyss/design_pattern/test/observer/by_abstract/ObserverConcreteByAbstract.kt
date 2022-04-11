package com.githubyss.design_pattern.test.observer.by_abstract

import com.githubyss.design_pattern.observer.by_abstract.ObserverAbstract
import com.githubyss.design_pattern.observer.by_abstract.SubjectAbstractByAbstract


class ObserverConcreteByAbstract(private val name: String, subject: SubjectAbstractByAbstract) : ObserverAbstract(subject) {
    override fun update() {
        println("观察者${name}的新状态：${subject.state}")
    }
}