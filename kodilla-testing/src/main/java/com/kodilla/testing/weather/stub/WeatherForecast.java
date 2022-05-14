package com.kodilla.testing.weather.stub;

import java.lang.reflect.Constructor;
import java.util.*;


public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double average() {
        double sum = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum/temperatures.getTemperatures().size();
    }
    public double median() {
        double average = 0.0;
        double median = 0.00;
        List<Double> employeeById = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(employeeById);
        if (employeeById.size() % 2 == 0) {
            average = employeeById.get(employeeById.size()/2) + employeeById.get((employeeById.size()/2)-1);
            median = average/2;
        }
        else {
            median = employeeById.get(employeeById.size()/2);
        }
        return median;


    }

}
