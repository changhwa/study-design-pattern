package coffee.pretense.study.designpattern.chapter2;

public class CafeMocha extends Coffee {

    @Override
    public String getMenuName() {
        return "CafeMocha";
    }

    public Integer cost(){
        return 5000+super.cost();
    }
}
