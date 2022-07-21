package weather;

import java.util.Observable;
import java.util.Observer;

public class SimpleObserver implements Observer {

    private int value;
    private Observable o;

    public SimpleObserver(Observable observable){
        this.o = observable;
        o.addObserver((Observer)this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        this.value = (int) arg;
        display();


        
    }
    public void display(){
        System.out.println("Value"+value);
    }

   
    
}
