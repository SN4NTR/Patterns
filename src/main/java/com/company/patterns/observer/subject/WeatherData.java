package com.company.patterns.observer.subject;

import com.company.patterns.observer.listener.Observer;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;
import static lombok.AccessLevel.PRIVATE;

@Data
@NoArgsConstructor(access = PRIVATE)
public class WeatherData implements Subject {

    private double temperature;
    private double humidity;
    private double pressure;

    private List<Observer> observerList = new ArrayList<>();

    private static WeatherData weatherData;

    public static WeatherData getInstance() {
        if (isNull(weatherData)) {
            weatherData = new WeatherData();
        }
        return weatherData;
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    private void measurementsChanged() {
        notifyObservers();
    }
}
