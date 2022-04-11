package com.githubyss.design_pattern.test.observer.boss_monitor_delegate


/**
 * ObserverStaffStock
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/11 15:52:00
 */
class ObserverStaffStock(private val name: String, private val subject: ISubject) {
    fun closeStockMarket() {
        println("${subject.name}：${subject.state} --> $name：关闭股票行情，继续工作！")
    }
}