package com.githubyss.design_pattern.test.observer.boss_monitor_delegate


/**
 * ISubject
 * 主题（被观察者）
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/11 15:51:11
 */
interface ISubject {
    // 主题名字
    var name: String

    // 主题状态
    var state: String

    // 通知
    fun tell()
}