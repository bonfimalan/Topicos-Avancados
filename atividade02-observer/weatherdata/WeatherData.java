package weatherdata;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import observer.Subject;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.format("Added observer with id: %d\n", o.getId());
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.format("Removed observer with id: %d\n", o.getId());
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temperature, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
