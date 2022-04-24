package designpattern.singleton.observerpattern;

import java.util.ArrayList;

public class  WeatherData implements Subject {
    private ArrayList Observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        Observers = new ArrayList();
    }

    @Override
    public void registerObserver(CurrentConditionsDisplay o) {
        Observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = Observers.indexOf(o);
        if (i >= 0) {
            Observers.remove(i);
        }

    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < Observers.size(); i++) {
            Observer observer = (Observer) Observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        measurementsChanged();
    }
}
