package design.patterns.strategyPattern.gameCharacter;

import design.patterns.strategyPattern.gameCharacter.interfaces.impl.Sword;

public class Knight extends Character {

    public Knight() {
        System.out.println(">>>>> Knight <<<<<");
        fight();
    }

    @Override
    public void fight() {
        weaponBehavior = new Sword();
    }
}