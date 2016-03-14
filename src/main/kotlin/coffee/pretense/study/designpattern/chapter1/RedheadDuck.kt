package coffee.pretense.study.designpattern.chapter1


class RedheadDuck: Duck(), Flyable, Quackable {

    override fun quack(): String {
        return "Quack"
    }

    override fun fly(): String {
        return "Fly"
    }

    override fun display(): String {
        return "RedheadDuck"
    }
}