package observer;

public interface Observer {
    int getId();
    void update(float temperature, float humidity, float pressure);
}
