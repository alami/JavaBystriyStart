package javabystriystart.HF02observer;
public class HF02observer {
    public static void start() {
/*
Паттерн Наблюдатель определяет отношение типа «один-ко-многим» между объектами.        
        
        */        
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
