package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    // instance variable dedclarations
    private List<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObserver(){
        for (Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }
   

   

    
}
