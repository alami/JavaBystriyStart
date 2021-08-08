package javabystriystart.HF03decorator;
public class HouseBlend extends Beverage{
    //Смесь для дома
    @Override
    public double cost() {
        return .89;
    }

    public HouseBlend() {
        description = "Домашняя смесь";
    }
    
}
