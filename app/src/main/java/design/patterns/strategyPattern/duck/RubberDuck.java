package design.patterns.strategyPattern.duck;

import design.patterns.strategyPattern.duck.interfaces.impl.fly.FlyNoWay;
import design.patterns.strategyPattern.duck.interfaces.impl.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        display();
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak(); 
    }

    @Override
    public void display() {
        System.out.println(">>>>> RubberDuck <<<<<");
    }

}