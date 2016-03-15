package coffee.pretense.study.designpattern.chapter1


class RedheadDuck: Duck() {

    lateinit private var fly: FlyAction
    lateinit private var quack: QuackAction

    fun setFlyAction(fly: FlyAction) {
        this.fly = fly
    }

    fun setQuackAction(quack: QuackAction) {
        this.quack = quack
    }

    fun quack(): String {
        return quack.quack()
    }

    fun fly(): String {
        return fly.fly();
    }
    override fun display(): String {
        return "RedheadDuck"
    }
}