package com.company.patterns.observer.listener.display;

import com.company.patterns.observer.listener.Observer;
import com.company.patterns.observer.subject.Subject;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {

    private double minTemperature;
    private double maxTemperature;
    private double avgTemperature;

    private List<Double> temperatures = new ArrayList<>();

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String statistic = String.format(
                "Min: %s\n" +
                        "Max: %s\n" +
                        "Avg: %s",
                minTemperature, maxTemperature, avgTemperature);

        System.out.println(statistic);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        temperatures.add(temperature);
        getStatistic();
        display();
    }

    private void getStatistic() {
        DoubleSummaryStatistics statistics = temperatures.stream()
                .mapToDouble(x -> x)
                .summaryStatistics();

        minTemperature = statistics.getMin();
        maxTemperature = statistics.getMax();
        avgTemperature = statistics.getAverage();
    }
}
