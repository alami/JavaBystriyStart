package javabystriystart.HF02observer;
public class ThirdPartyDisplay implements Observer, DisplayElement{

    @Override
    public void update(float temp, float humidity, float pressure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("--Вендорская реализация для создания собственных визуальных элементов.");
    }
    
}
