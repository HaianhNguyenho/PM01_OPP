package weather;

public class StaticDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData w;

    public StaticDisplay(WeatherData weatherData){
        this.w = weatherData;
        w.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperate = "+(tempSum/numReadings) + "/" + maxTemp + "/" +minTemp);
        
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings ++;

        if(temperature > maxTemp){
            maxTemp = temperature;
        }
        if(temperature < minTemp){
            maxTemp = temperature;
        }
        display();
        
    }
    
}
