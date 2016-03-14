package coffee.pretense.study.designpattern.chapter1

class RubberDuck: Duck(), Quackable {

    override fun display(): String {
        return "RubberDuck"
    }

    override fun quack(): String {
        return "Ppick"
    }
}