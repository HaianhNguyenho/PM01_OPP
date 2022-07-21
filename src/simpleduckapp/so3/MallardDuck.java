package simpleduckapp.so3;

public class MallardDuck extends Duck{

    @Override
  public  void display() {
        System.out.println("I'm a real Mallard duck");
        
    }

    public MallardDuck(){
        QuackBehavior quackBehavior = new Quack();
        FlyBehavior flyBehavior = new FlyWithWings();
    }

    
    
}
