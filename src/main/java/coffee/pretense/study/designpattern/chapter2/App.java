package coffee.pretense.study.designpattern.chapter2;

public class App {

    public static void main(String[] args) {

        Coffee coffee = new Espresso();
        coffee.setMocha(false);
        coffee.setWhip(true);
        System.out.println(coffee.getMenuName() + " : " + coffee.cost());
    }
}
