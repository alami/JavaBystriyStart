package javabystriystart.HF02observer;
public class ForecastDisplay implements Observer, DisplayElement{

    @Override
    public void update(float temp, float humidity, float pressure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("--выводит прогноз погоды по показаниям барометра.--");
    }
    
}
