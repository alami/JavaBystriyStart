package javabystriystart.HF02observer;
import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    float temperature;
    float humidity;
    float pressure;
    Display currentConditionsDisplay;
    Display statisticsDisplay;
    Display forecastDisplay;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }    
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void measurementsChanged() {
        notifyObservers();
        /*float temp = getTemperature();         float humidity = getHumidity();        float pressure = getPressure();
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);*/
    }    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    
}
