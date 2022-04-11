package com.githubyss.design_pattern.test.observer.boss_monitor


abstract class ObserverAbstractWithName(protected val name: String, protected val subject: SubjectAbstractWithName) {
    abstract fun update()
}