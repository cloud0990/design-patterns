package design.patterns.strategyPattern.duck;

import design.patterns.strategyPattern.duck.interfaces.impl.fly.FlyNoWay;
import design.patterns.strategyPattern.duck.interfaces.impl.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        display();
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(">>>>> ModelDuck <<<<<");
    }

}