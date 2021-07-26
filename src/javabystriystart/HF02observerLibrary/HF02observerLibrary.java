package javabystriystart.HF02observerLibrary;

import javabystriystart.HF02observerLibrary.*;

public class HF02observerLibrary {
    public static void start() {
/*
Паттерн Наблюдатель определяет отношение типа «один-ко-многим» между объектами.        
        
        */        
        System.out.println("-- HF02observerLibrary ---");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
