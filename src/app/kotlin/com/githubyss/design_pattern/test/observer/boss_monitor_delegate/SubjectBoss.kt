package com.githubyss.design_pattern.test.observer.boss_monitor_delegate


class SubjectBoss(override var name: String) : ISubject {
    var action: String = ""

    override var state: String
        get() = action
        set(value) {
            action = value
        }

    override fun tell() {

    }
}