package javabystriystart.HF01strategy;
public class DecoyDuck extends Duck{

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    
    @Override
    public void display() {
        System.out.println("..DecoyDuck(Деревянные)..");
    }

    @Override
    public void swim() {
    }
}
