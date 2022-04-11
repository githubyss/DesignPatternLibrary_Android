package com.githubyss.design_pattern.test.observer.boss_monitor


abstract class SubjectAbstractWithName(val name: String) {
    // 通知者状态
    abstract var state: String

    abstract fun attach(observer: ObserverAbstractWithName)
    abstract fun detach(observer: ObserverAbstractWithName)

    // 通知
    abstract fun tell()
}