package coffee.pretense.study.designpattern.chapter2;

public class Americano extends Coffee {

    @Override
    public String getMenuName() {
        return "Americano";
    }

    @Override
    public Integer cost() {
        return 4000;
    }
}
