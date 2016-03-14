package coffee.pretense.study.designpattern.chapter1


abstract class Duck {

    fun quack(): String{
        return "Quack"
    }

    fun swim(): String {
        return "Swim"
    }

    abstract fun display(): String
}