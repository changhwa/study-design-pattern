package coffee.pretense.study.designpattern.chapter1

class RubberDuck(var quack: QuackAction): Duck(){

    override fun display(): String {
        return "RubberDuck"
    }

    fun quack(): String {
        return quack.quack()
    }
}