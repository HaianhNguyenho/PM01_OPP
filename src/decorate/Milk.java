package decorate;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {

       return beverage.cost() +.20;
       
    }
    
}
