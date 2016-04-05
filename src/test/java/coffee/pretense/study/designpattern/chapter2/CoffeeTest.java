package coffee.pretense.study.designpattern.chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CoffeeTest {

    private Coffee espresso;
    private Coffee americano;
    private Coffee cafeMocha;

    @Before
    public void setup(){
        espresso = new Espresso();
        americano = new Americano();
        cafeMocha = new CafeMocha();
    }

    @Test
    public void test_order_espresso(){
        assertThat(espresso.getMenuName(), is("Espresso"));
        assertThat(espresso.cost(), is(2000));
    }

    @Test
    public void test_order_espresso_and_icecream(){
        espresso.setIcecream(true);
        assertThat(espresso.getMenuName(), is("Espresso"));
        assertThat(espresso.cost(), is(4000));
    }

    @Test
    public void test_order_espresso_and_icecream_and_conpanna(){
        espresso.setIcecream(true);
        espresso.setConPanna(true);
        assertThat(espresso.getMenuName(), is("Espresso"));
        assertThat(espresso.cost(), is(5000));
    }

    @Test
    public void test_order_americano(){
        assertThat(americano.getMenuName(), is("Americano"));
        assertThat(americano.cost(), is(4000));
    }

    @Test
    public void test_order_cafe_mocha(){
        assertThat(cafeMocha.getMenuName(), is("CafeMocha"));
        assertThat(cafeMocha.cost(), is(5000));
    }

    @Test
    public void test_order_cafe_mocha_and_mocha_and_banana_and_whip(){
        cafeMocha.setMocha(true);
        cafeMocha.setBanana(true);
        cafeMocha.setWhip(true);
        assertThat(cafeMocha.getMenuName(), is("CafeMocha"));
        assertThat(cafeMocha.cost(), is(7500));
    }
}