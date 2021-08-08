package javabystriystart.HF03decorator;
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Темная обжарка";
    }
    //кофе сильного способа обжаривания
    @Override            
    public double cost() {
                return .99;

    }
    
}
