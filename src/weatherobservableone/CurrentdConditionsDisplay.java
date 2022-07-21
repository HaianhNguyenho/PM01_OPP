package weatherobservableone;

import java.util.Observable;
import java.util.Observer;

public class CurrentdConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;

    private float humidity;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and "+ humidity + "% humidity");
        
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
        
    }
    
    
}
