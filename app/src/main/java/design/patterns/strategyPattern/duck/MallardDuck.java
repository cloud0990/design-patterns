package design.patterns.strategyPattern.duck;

import design.patterns.strategyPattern.duck.interfaces.impl.fly.FlyWithWings;
import design.patterns.strategyPattern.duck.interfaces.impl.quack.MuteQuack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        display();
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println(">>>>> MallardDuck <<<<<");
    }

}