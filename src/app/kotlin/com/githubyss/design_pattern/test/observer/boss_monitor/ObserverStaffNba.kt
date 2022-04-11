package com.githubyss.design_pattern.test.observer.boss_monitor


class ObserverStaffNba(name: String, subject: SubjectAbstractWithName) : ObserverAbstractWithName(name, subject) {
    override fun update() {
        println("${subject.name}：${subject.state} --> $name：关闭 NBA 直播，继续工作！")
    }
}