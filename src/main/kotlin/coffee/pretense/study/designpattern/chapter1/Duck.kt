package coffee.pretense.study.designpattern.chapter1


abstract class Duck {

    fun swim(): String {
        return "Swim"
    }

    abstract fun display(): String
}