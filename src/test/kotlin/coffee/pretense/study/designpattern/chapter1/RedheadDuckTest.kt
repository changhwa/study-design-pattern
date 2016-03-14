package coffee.pretense.study.designpattern.chapter1

import org.junit.Test

import org.junit.Assert.*

class RedheadDuckTest {

    var redheadDuck = RedheadDuck()

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
}