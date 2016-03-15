package coffee.pretense.study.designpattern.chapter1

class RubberDuck: Duck(){

    lateinit var quack: QuackAction

    fun setQuackAction(quack: QuackAction){
        this.quack = quack
    }

    override fun display(): String {
        return "RubberDuck"
    }

    fun quack(): String {
        return quack.quack()
    }
}