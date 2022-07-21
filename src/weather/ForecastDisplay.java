package weather;

public class ForecastDisplay implements Observer, DisplayElement{
    private float c = 29.92f;

    private float l;

    private WeatherData w;

    public ForecastDisplay(WeatherData weatherData){
        this.w = weatherData;
        this.w.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if(c > l){
            System.out.println("Improving weather on the way!");
        }
        else if(c == l){
            System.out.println("More of the same");
        }else if(c < l){
            System.out.println("Watch out for cooler, raint weather");
        }
        
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        c = pressure;

        display();

        
    }
    
    
}
