package com.company.patterns.observer.listener.display;

import com.company.patterns.observer.listener.Observer;
import com.company.patterns.observer.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;
    private double pressure;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String info = String.format(
                "Temperature: %s\n" +
                        "Humidity: %s\n" +
                        "Pressure: %s",
                temperature, humidity, pressure
        );

        System.out.println(info);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
