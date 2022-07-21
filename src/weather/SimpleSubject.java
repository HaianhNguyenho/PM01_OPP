package weather;

import java.util.Observable;
public class SimpleSubject extends Observable{
    private int value;

    public SimpleSubject(){

    }
    public void setValue(int value){
        this.value = value;
        setChanged();
        notifyObservers(value);
    }

    public int getValue(){
        return this.value;
    }
    
}
