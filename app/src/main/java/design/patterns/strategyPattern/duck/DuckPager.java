package design.patterns.strategyPattern.duck;

import design.patterns.strategyPattern.duck.interfaces.QuackBehavior;

public class DuckPager {

    public DuckPager() {
    }

    // 오리 호출기
    public void callDuckPager(QuackBehavior qb) {
        Duck duck = new Duck() {
            @Override
            public void display() {
                System.out.println(">>>>> DuckPager <<<<<");
            }
        };

        duck.display();
        duck.setQuackBehavior(qb);
        duck.performQuack();
    }

}