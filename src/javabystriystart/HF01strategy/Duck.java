package javabystriystart.HF01strategy;
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void swim(){
        System.out.println("swiming");
    }
    public void display() {
        System.out.println("..Duck..");
    }    
    public void functions() {
        quackBehavior.quack(); swim(); flyBehavior.fly(); display();
        System.out.println("");
    }
}
