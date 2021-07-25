package javabystriystart.HF01strategy;
public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }    
    @Override
    public void display() {
        System.out.println("..RubberDuck(Резиновые)..");
    }   
}
