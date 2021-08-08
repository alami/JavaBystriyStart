package javabystriystart.HF03decorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", с соей ";
}
public double cost() {
        return .20 + beverage.cost();
    }
}
