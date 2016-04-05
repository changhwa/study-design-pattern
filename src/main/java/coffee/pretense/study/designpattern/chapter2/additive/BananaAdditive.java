package coffee.pretense.study.designpattern.chapter2.additive;

import coffee.pretense.study.designpattern.chapter2.Coffee;

public class BananaAdditive extends AdditiveDecorator {

    private Coffee coffee;
    private final Integer bananaCost = 1000;

    public BananaAdditive(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getMenuName() {
        return coffee.getMenuName() + "+banana";
    }

    public Integer cost(){
        return coffee.cost()+bananaCost;
    }
}
