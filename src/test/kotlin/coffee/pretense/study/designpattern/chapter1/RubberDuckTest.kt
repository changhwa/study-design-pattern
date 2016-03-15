package coffee.pretense.study.designpattern.chapter1

import coffee.pretense.study.designpattern.chapter1.action.PickQuack
import coffee.pretense.study.designpattern.chapter1.action.QuackAction
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class RubberDuckTest() {

    lateinit var quackAction: QuackAction
    lateinit var rubberDuck: Duck

    @Before
    fun init() {
        quackAction = PickQuack()
        rubberDuck = RubberDuck()
        rubberDuck.setQuackAction(quackAction)
    }

    @Test
    fun test_redhead_duck_display() {
        assertEquals("RubberDuck", rubberDuck.display())
    }

    @Test
    fun test_redhead_duck_swim() {
        assertEquals("Swim", rubberDuck.swim())
    }

    @Test
    fun test_redhead_duck_quack() {
        assertEquals("Ppick", rubberDuck.quack())
    }
}