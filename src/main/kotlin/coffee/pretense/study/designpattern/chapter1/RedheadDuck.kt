package coffee.pretense.study.designpattern.chapter1


class RedheadDuck(var flyAction: FlyAction, var quack: QuackAction): Duck() {

    fun quack(): String {
        return quack.quack()
    }

    fun fly(): String {
        return flyAction.fly();
    }
    override fun display(): String {
        return "RedheadDuck"
    }
}