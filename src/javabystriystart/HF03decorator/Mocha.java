package javabystriystart.HF03decorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", c шоколадом";
}
public double cost() {
        return .20 + beverage.cost();
    }
}
