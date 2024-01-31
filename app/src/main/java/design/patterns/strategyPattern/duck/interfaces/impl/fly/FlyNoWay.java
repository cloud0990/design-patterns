package design.patterns.strategyPattern.duck.interfaces.impl.fly;

import design.patterns.strategyPattern.duck.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        // 날아다니지 않음
        System.out.println("FlyNoWay: 날아다니지 않음");
    }
}