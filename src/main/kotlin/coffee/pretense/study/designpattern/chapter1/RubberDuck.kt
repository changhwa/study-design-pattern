package coffee.pretense.study.designpattern.chapter1

class RubberDuck: Duck() {

    override fun display(): String {
        return "RubberDuck"
    }

    override fun quack(): String {
        return "Ppick"
    }

    override fun fly(): String {
        return "Not Fly"
    }
}