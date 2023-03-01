import observer.Observer;
import weatherdata.ConditionObserver;
import weatherdata.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer ob1 = new ConditionObserver();
        Observer ob2 = new ConditionObserver();
        Observer ob3 = new ConditionObserver();

        weatherData.registerObserver(ob1);
        weatherData.registerObserver(ob2);
        
        weatherData.setMeasurements(25f, 50f, 1f);
        
        weatherData.registerObserver(ob3);

        weatherData.setMeasurements(23f, 45f, 1f);

        weatherData.removeObserver(ob2);

        weatherData.setMeasurements(20f, 40f, 1f);
    }
}