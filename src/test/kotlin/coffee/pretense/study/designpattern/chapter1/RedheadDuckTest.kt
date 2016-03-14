package coffee.pretense.study.designpattern.chapter1

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class RedheadDuckTest {

    lateinit var flyWithWings: FlyAction
    lateinit var simpleQuack: QuackAction
    lateinit var redheadDuck: RedheadDuck

    @Before
    fun init() {
        flyWithWings = FlyWithWings()
        simpleQuack = SimpleQuack()
        redheadDuck = RedheadDuck(flyWithWings, simpleQuack)
    }

    @Test
    fun test_redhead_duck_display() {
        assertEquals("RedheadDuck", redheadDuck.display())
    }

    @Test
    fun test_redhead_duck_swim() {
        assertEquals("Swim", redheadDuck.swim())
    }

    @Test
    fun test_redhead_duck_quack() {
        assertEquals("Quack", redheadDuck.quack())
    }

    @Test
    fun test_redhead_duck_fly() {
        assertEquals("Fly", redheadDuck.fly())
    }
}