package design.patterns.strategyPattern.gameCharacter;

import design.patterns.strategyPattern.gameCharacter.interfaces.impl.Knife;

public class Queen extends Character {

    public Queen() {
        System.out.println(">>>>> Queen <<<<<");
    }

    @Override
    public void fight() {
        weaponBehavior = new Knife();
    }

}