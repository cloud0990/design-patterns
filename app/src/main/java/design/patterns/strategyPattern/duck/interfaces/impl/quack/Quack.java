package design.patterns.strategyPattern.duck.interfaces.impl.quack;

import design.patterns.strategyPattern.duck.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack: 꽥꽥");
    }

}