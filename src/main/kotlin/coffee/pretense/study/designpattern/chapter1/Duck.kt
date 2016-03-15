package coffee.pretense.study.designpattern.chapter1

import coffee.pretense.study.designpattern.chapter1.action.FlyAction
import coffee.pretense.study.designpattern.chapter1.action.QuackAction


abstract class Duck {

    lateinit private var fly: FlyAction
    lateinit private var quack: QuackAction

    fun setFlyAction(fly: FlyAction) {
        this.fly = fly
    }

    fun setQuackAction(quack: QuackAction) {
        this.quack = quack
    }

    fun swim(): String = "Swim"

    fun fly():String = fly.fly()

    fun quack():String = quack.quack()

    abstract fun display(): String //직접구현
}