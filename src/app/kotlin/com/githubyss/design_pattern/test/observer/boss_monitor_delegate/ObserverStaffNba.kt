package com.githubyss.design_pattern.test.observer.boss_monitor_delegate


/**
 * ObserverStaffNba
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/11 15:51:54
 */
class ObserverStaffNba(private val name: String, private val subject: ISubject) {
    fun closeNbaDirectSeeding() {
        println("${subject.name}：${subject.state} --> $name：关闭 NBA 直播，继续工作！")
    }
}