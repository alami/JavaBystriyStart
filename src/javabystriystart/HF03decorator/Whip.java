package javabystriystart.HF03decorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", c взбитыми сливками.";
}
public double cost() {
        return .20 + beverage.cost();
    }
}
