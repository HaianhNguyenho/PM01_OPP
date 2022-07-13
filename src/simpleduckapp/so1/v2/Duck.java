package simpleduckapp.so1.v2;

public abstract class Duck {

    public void quack(){
        System.out.println("Quacking...");
    }
    
    public void swim(){
        System.out.println("Swiming...");
    }
    public abstract void display();
}
