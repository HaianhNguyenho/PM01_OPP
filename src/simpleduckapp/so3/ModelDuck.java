package simpleduckapp.so3;

public class ModelDuck  extends Duck{

    public ModelDuck(){
        FlyBehavior flyBehavior = new FlyNoWay();
        
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I'm a model duck");
        
    }

    
}
