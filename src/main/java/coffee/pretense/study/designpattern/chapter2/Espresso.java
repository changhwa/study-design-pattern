package coffee.pretense.study.designpattern.chapter2;

public class Espresso extends Coffee {

    @Override
    public String getMenuName() {
        return "Espresso";
    }

    @Override
    public Integer cost() {
        return 2000 + super.cost();
    }
}
