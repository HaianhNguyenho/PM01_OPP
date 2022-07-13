package simpleduckapp.so1.v2;

public class So1TestDrive {
    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck();
        mallarDuck.swim();
        mallarDuck.quack();

        Duck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.swim();
        readHeadDuck.quack();

    }
    
}
