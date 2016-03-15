package coffee.pretense.study.designpattern.chapter1


abstract class Duck {

    lateinit private var fly: FlyAction
    lateinit private var quack: QuackAction

    fun setFlyAction(fly: FlyAction) {
        this.fly = fly
    }

    fun setQuackAction(quack: QuackAction) {
        this.quack = quack
    }

    fun swim(): String {
        return "Swim"
    }

    fun fly():String {
        return fly.fly()
    }

    fun quack():String {
        return quack.quack()
    }

    abstract fun display(): String //직접구현
}