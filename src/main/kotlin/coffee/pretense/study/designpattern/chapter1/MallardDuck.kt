package coffee.pretense.study.designpattern.chapter1

class MallardDuck: Duck(){

    lateinit private var fly: FlyAction
    lateinit private var quack: QuackAction

    fun setFlyAction(fly: FlyAction) {
        this.fly = fly
    }

    fun setQuackAction(quack: QuackAction) {
        this.quack = quack
    }

    override fun display(): String {
        return "MallardDuck"
    }

    fun quack(): String {
        return quack.quack()
    }

    fun fly(): String {
        return fly.fly()
    }
}

