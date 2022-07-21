package observer;

public interface Observer {
    public void update(int value);

    public void update(float temperature, float humidity, float pressure);
}
