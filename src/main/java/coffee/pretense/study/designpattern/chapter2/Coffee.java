package coffee.pretense.study.designpattern.chapter2;

public abstract class Coffee {

    private final Integer mochaCost = 500;
    private final Integer whipCost = 1000;
    private final Integer icecreamCost = 2000;
    private final Integer conPannaCost = 1000;


    private Boolean mocha = false;
    private Boolean whip = false;
    private Boolean icecream = false;
    private Boolean conPanna = false;


    public abstract String getMenuName();

    public Integer cost(){
        int cost = 0;

        if(hasMocha()){
            cost += mochaCost;
        }

        if(hasWhip()){
            cost += whipCost;
        }

        if(hasIcecream()){
            cost += icecreamCost;
        }

        if(hasConPanna()){
            cost += conPannaCost;
        }


        return cost;
    }

    public void setMocha(Boolean mocha){
        this.mocha = mocha;
    }

    public void setWhip(Boolean whip){
        this.whip = whip;
    }

    public void setIcecream(Boolean icecream){
        this.icecream = icecream;
    }

    public void setConPanna(Boolean conPanna){
        this.conPanna = conPanna;
    }

    private Boolean hasMocha(){
        return mocha;
    }

    private Boolean hasWhip(){
        return whip;
    }

    private Boolean hasIcecream(){
        return icecream;
    }

    private Boolean hasConPanna(){
        return conPanna;
    }
}
