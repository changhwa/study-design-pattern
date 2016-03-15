package coffee.pretense.study.designpattern.chapter1

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MallardDuckTest() {

    lateinit var flyWithWings: FlyAction
    lateinit var simpleQuack: QuackAction
    lateinit var mallardDuck: MallardDuck

    @Before
    fun init(){
        flyWithWings = FlyWithWings()
        simpleQuack = SimpleQuack()
        mallardDuck = MallardDuck()
        mallardDuck.setFlyAction(flyWithWings)
        mallardDuck.setQuackAction(simpleQuack)
    }

    @Test
    fun test_mallard_duck_display() {
        assertEquals("MallardDuck", mallardDuck.display())
    }

    @Test
    fun test_mallard_duck_swim() {
        assertEquals("Swim", mallardDuck.swim())
    }

    @Test
    fun test_mallard_duck_quack() {
        assertEquals("Quack", mallardDuck.quack())
    }

    @Test
    fun test_mallard_duck_fly() {
        assertEquals("Fly", mallardDuck.fly())
    }

    @Test
    fun test_mallard_duck_quack_change() {
        var pickQuack: QuackAction = PickQuack()
        mallardDuck.setQuackAction(pickQuack)
        assertEquals("Ppick", mallardDuck.quack())
    }
}