package design.patterns.strategyPattern.duck.interfaces.impl.quack;

import design.patterns.strategyPattern.duck.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("MuteQuack: ~ 조용 ~");
    }

}
