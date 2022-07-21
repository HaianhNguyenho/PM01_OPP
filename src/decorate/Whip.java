package decorate;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return beverage.cost() + .20;
    }
    
}
