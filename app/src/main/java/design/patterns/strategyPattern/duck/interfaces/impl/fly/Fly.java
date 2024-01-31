package design.patterns.strategyPattern.duck.interfaces.impl.fly;

import design.patterns.strategyPattern.duck.interfaces.FlyBehavior;

public class Fly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly: 날다");
    }

}