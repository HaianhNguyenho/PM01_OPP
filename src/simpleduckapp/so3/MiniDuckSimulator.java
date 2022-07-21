package simpleduckapp.so3;

public class MiniDuckSimulator {
    public static void main(String[] args) {
       MallardDuck malladDuck = new MallardDuck();
       DecoyDuck decoyDuck = new DecoyDuck();

       malladDuck.performQuack();

       decoyDuck.performQuack();

    }
    
}
