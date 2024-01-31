package design.patterns.strategyPattern.duck.interfaces.impl.quack;

import design.patterns.strategyPattern.duck.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("Squeak: 삑");
    }
    
}