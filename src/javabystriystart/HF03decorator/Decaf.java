package javabystriystart.HF03decorator;
public class Decaf extends Beverage{

    public Decaf() {
        description = "Кофе без кофеина";
    }
    
   
    @Override
    public double cost() {
        return 0;
    }
    
}
