package com.githubyss.design_pattern.test

import com.githubyss.design_pattern.test.builder.builder
import com.githubyss.design_pattern.test.decorator.decorator
import com.githubyss.design_pattern.test.facade.facade
import com.githubyss.design_pattern.test.factory_method_reflect.factoryMethodReflect
import com.githubyss.design_pattern.test.factory_method.factoryMethod
import com.githubyss.design_pattern.test.factory_simple.factorySimple
import com.githubyss.design_pattern.test.observer.observer
import com.githubyss.design_pattern.test.prototype.prototype
import com.githubyss.design_pattern.test.proxy.proxy
import com.githubyss.design_pattern.test.strategy.strategy
import com.githubyss.design_pattern.test.template_method.templateMethod


/**
 * DesignPatternTest
 *
 * 设计模式调测
 *
 * 1.工厂方法模式		Factory Method Pattern
 *
 * 2.抽象工厂模式		Abstract Factory Pattern
 *
 * 3.建造者模式		Builder Pattern
 *
 * 4.原型模式		Prototype Pattern
 *
 * 5.单例模式		Singleton Pattern
 *
 * 6.适配器模式		Adapter Pattern
 *
 * 7.桥梁模式桥接模式	Bridge Pattern
 *
 * 8.组合模式		Composite Pattern
 *
 * 9.装饰模式		Decorator Pattern
 *
 * 10.门面模式外观模式	Facade Pattern
 *
 * 11.享元模式		Flyweight Pattern
 *
 * 12.代理模式		Proxy pattern
 *
 * 13.责任链模式		Chain of Responsibility Pattern
 *
 * 14.命令模式		Command Pattern
 *
 * 15.解释器模式		Interpreter Pattern
 *
 * 16.迭代器模式		Iterator Pattern
 *
 * 17.中介者模式		Mediator Pattern
 *
 * 18.备忘录模式		Memento Pattern
 *
 * 19.观察者模式		Observer Pattern
 *
 * 20.状态模式		State Pattern
 *
 * 21.策略模式		Strategy Pattern
 *
 * 22.模板方法模式	Template Method Pattern
 *
 * 23.访问者模式		Visitor Pattern
 *
 * @author Ace Yan
 * @github githubyss
 * @createdTime 2022/03/09 17:53:07
 */

const val PREFIX = ">>>>>"

const val PRE_NUMBER = 3.0
const val POST_NUMBER = 9.0

const val MONEY: Double = 1000.0
const val MONEY_REBATE: Double = 0.8
const val MONEY_CONDITION: Double = 300.0
const val MONEY_RETURN: Double = 100.0

fun main(args: Array<String>) {
    println(args)
    println()

    factorySimple()
    factoryMethod()
    factoryMethodReflect()
    strategy()
    decorator()
    proxy()
    prototype()
    templateMethod()
    facade()
    builder()
    observer()
}