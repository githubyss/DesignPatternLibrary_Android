package com.githubyss.design_pattern.test.observer

import com.githubyss.design_pattern.observer.by_abstract.ObserverAbstract
import com.githubyss.design_pattern.observer.by_abstract.SubjectAbstractByAbstract
import com.githubyss.design_pattern.observer.by_interface.IObserver
import com.githubyss.design_pattern.observer.by_interface.SubjectAbstractByInterface
import com.githubyss.design_pattern.test.PREFIX
import com.githubyss.design_pattern.test.observer.boss_monitor.*
import com.githubyss.design_pattern.test.observer.by_abstract.ObserverConcreteByAbstract
import com.githubyss.design_pattern.test.observer.by_abstract.SubjectConcreteByAbstract
import com.githubyss.design_pattern.test.observer.by_interface.ObserverConcreteByInterface
import com.githubyss.design_pattern.test.observer.by_interface.SubjectConcreteByInterface


/**
 * TestObserver
 *
 * 使用场景：
 *
 * 当一个对象的改变需要同时改变其他对象的时候，而且它不知道具体有多少对象有待改变。
 *
 * 当一个抽象模型有两个方面，其中一个方面依赖于另一个方面，用观察者模式可以将这两者封装在独立的对象中，使它们各自独立地改变和复用。
 *
 * 观察者模式所做的工作其实就是在解除耦合。让耦合双方都依赖于抽象，而不是依赖于具体。从而使各自的变化都不会影响另一边的变化。
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/04/11 10:21:47
 */

fun observer() {
    println("$PREFIX Observer 观察者模式")
    println()

    // 前台小姐姐
    val subjectSecretary: SubjectAbstractWithName = SubjectSecretary("童子喆")
    // 老板胡汉三
    val subjectBoss: SubjectAbstractWithName = SubjectBoss("胡汉三")

    // 看股票的员工
    val observerStaffStock1: ObserverAbstractWithName = ObserverStaffStock("魏关姹", subjectSecretary)
    val observerStaffStock2: ObserverAbstractWithName = ObserverStaffStock("易管查", subjectSecretary)
    // 看 NBA 的员工
    val observerStaffNba: ObserverAbstractWithName = ObserverStaffNba("牛志波", subjectBoss)

    // 前台登记的同事
    subjectSecretary.attach(observerStaffStock1)
    subjectSecretary.attach(observerStaffStock2)
    // 前台未登记的同事
    subjectBoss.attach(observerStaffNba)

    // 发现老板回来了
    subjectSecretary.state = "老板回来了！"
    // 老板自己回来了
    subjectBoss.state = "我胡汉三回来了！"

    // 通知员工
    subjectSecretary.tell()
    subjectBoss.tell()
    println()

    val subjectConcreteByAbstract: SubjectAbstractByAbstract = SubjectConcreteByAbstract()
    val observerConcreteByAbstractX: ObserverAbstract = ObserverConcreteByAbstract("X", subjectConcreteByAbstract)
    val observerConcreteByAbstractY: ObserverAbstract = ObserverConcreteByAbstract("Y", subjectConcreteByAbstract)
    subjectConcreteByAbstract.attach(observerConcreteByAbstractX)
    subjectConcreteByAbstract.attach(observerConcreteByAbstractY)
    subjectConcreteByAbstract.state = "ABC"
    subjectConcreteByAbstract.tell()
    subjectConcreteByAbstract.state = "XXX"
    subjectConcreteByAbstract.tell()
    println()

    val subjectConcreteByInterface: SubjectAbstractByInterface = SubjectConcreteByInterface()
    val observerConcreteByInterfaceX: IObserver = ObserverConcreteByInterface("X", subjectConcreteByInterface)
    val observerConcreteByInterfaceY: IObserver = ObserverConcreteByInterface("Y", subjectConcreteByInterface)
    subjectConcreteByInterface.attach(observerConcreteByInterfaceX)
    subjectConcreteByInterface.attach(observerConcreteByInterfaceY)
    subjectConcreteByInterface.state = "ABC"
    subjectConcreteByInterface.tell()
    subjectConcreteByInterface.state = "XXX"
    subjectConcreteByInterface.tell()
    println()
}