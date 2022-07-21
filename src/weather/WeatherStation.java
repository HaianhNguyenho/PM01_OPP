package weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(w);
        
        StaticDisplay staticDisplay = new StaticDisplay(w);

        ForecastDisplay forecastDisplay = new ForecastDisplay(w);

        w.setMeasurements(80, 65, 30.4f);
        w.setMeasurements(82, 70, 29.2f);
        w.setMeasurements(78, 90, 29.2f);

        w.removeObserver(forecastDisplay);
        w.setMeasurements(62, 90, 28.1f);
    }
    
}
