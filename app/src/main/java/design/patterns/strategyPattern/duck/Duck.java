package design.patterns.strategyPattern.duck;

import design.patterns.strategyPattern.duck.interfaces.FlyBehavior;
import design.patterns.strategyPattern.duck.interfaces.QuackBehavior;

public abstract class Duck {

    public Duck() {
    }

    // 레퍼런스 변수
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("Duck: 수영하다");
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

}