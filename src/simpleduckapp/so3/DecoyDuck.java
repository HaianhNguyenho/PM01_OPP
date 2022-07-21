package simpleduckapp.so3;

public class DecoyDuck extends Duck {

   public DecoyDuck(){
    setFlyBehavior(new FlyWithWings());
    setQuackBehavior(new MuteQuack());
   }


    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I'm a duck decoy");
    }


    
}
