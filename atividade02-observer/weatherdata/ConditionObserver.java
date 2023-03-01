package weatherdata;

import observer.Observer;

public class ConditionObserver implements Observer {
    private int id;
    private static int cont;

    public ConditionObserver() {
        this.id = ++cont;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.format(
            "Observer %d observed this measurements: %.2f temperature, %.2f, humidity %.2f pressure\n", id, temperature, humidity, pressure);
    }

    @Override
    public int getId() {
        return this.id;
    }
    
}
