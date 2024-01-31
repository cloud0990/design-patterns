package design.patterns.strategyPattern.duck.interfaces.impl.fly;

import design.patterns.strategyPattern.duck.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlyWithWings: 푸드덕푸드덕");
    }

}