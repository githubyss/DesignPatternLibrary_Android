package com.githubyss.design_pattern.test.observer.boss_monitor


class ObserverStaffStock(name: String, subject: SubjectAbstractWithName) : ObserverAbstractWithName(name, subject) {
    override fun update() {
        println("${subject.name}：${subject.state} --> $name：关闭股票行情，继续工作！")
    }
}