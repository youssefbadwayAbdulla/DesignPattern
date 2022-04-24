package designpattern.singleton.observerpattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurement(80,65,30.4f);
        currentConditionsDisplay.update(60,80,89.5f);
    }
}
