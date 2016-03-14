package coffee.pretense.study.designpattern.chapter1


abstract class Duck {

    open fun quack(): String{
        return "Quack"
    }

    fun swim(): String {
        return "Swim"
    }

    open fun fly(): String {
        return "Fly"
    }

    abstract fun display(): String
}