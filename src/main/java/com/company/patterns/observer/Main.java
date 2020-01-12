package com.company.patterns.observer;

import com.company.patterns.observer.listener.display.CurrentConditionsDisplay;
import com.company.patterns.observer.listener.display.StatisticsDisplay;
import com.company.patterns.observer.subject.WeatherData;

import static com.company.patterns.observer.subject.WeatherData.getInstance;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = getInstance();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(20, 80, 762.2);
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(25, 72, 755);
    }
}
