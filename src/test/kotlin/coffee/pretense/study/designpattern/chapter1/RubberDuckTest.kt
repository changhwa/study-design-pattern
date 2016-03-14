package coffee.pretense.study.designpattern.chapter1

import org.junit.Test
import kotlin.test.assertEquals

class RubberDuckTest() {

    var rubberDuck = RubberDuck()

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