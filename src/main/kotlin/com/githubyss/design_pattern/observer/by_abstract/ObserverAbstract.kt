package com.githubyss.design_pattern.observer.by_abstract


abstract class ObserverAbstract(protected val subject: SubjectAbstractByAbstract) {
    abstract fun update()
}