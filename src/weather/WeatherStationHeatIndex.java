package weather;

public class WeatherStationHeatIndex {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(w);
        StaticDisplay staticDisplay = new StaticDisplay(w);
        ForecastDisplay forecastDisplay = new ForecastDisplay(w);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(w);

        w.setMeasurements(80, 65, 30.4f);
        w.setMeasurements(82, 70, 29.2f);
        w.setMeasurements(78, 90, 29.2f);

    }
    
}
