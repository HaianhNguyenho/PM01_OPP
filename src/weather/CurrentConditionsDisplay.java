package weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float t;

    private float h;

    private WeatherData w;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.w = weatherData;
        w.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: "+t +"F degrees and"+h+"% humidity");
        
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.t = temperature;
        this.h = humidity;
        display();
        
    }
    
}
