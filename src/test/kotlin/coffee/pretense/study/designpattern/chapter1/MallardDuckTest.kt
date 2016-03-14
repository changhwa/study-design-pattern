package coffee.pretense.study.designpattern.chapter1

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MallardDuckTest() {

    var mallardDuck: MallardDuck = MallardDuck()

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

}