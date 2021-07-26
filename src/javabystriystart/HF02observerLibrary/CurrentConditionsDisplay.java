package javabystriystart.HF02observerLibrary;
import java.util.Observable;
import java.util.Observer;
import javabystriystart.HF02observer.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {        
        this.observable = observable;
        observable.addObserver(this);
    }
    
    
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.temperature;
            this.humidity = weatherData.humidity;
            display();                    
        }
    }

    @Override
    public void display() {
        System.out.println("--выводит текущие значения переменных объектта WeatherData.--");
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }
    
}
