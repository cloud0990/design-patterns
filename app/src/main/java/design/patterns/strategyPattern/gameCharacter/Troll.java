package design.patterns.strategyPattern.gameCharacter;

import design.patterns.strategyPattern.gameCharacter.interfaces.impl.Axe;

public class Troll extends Character {

    public Troll() {
        System.out.println(">>>>> Troll <<<<<");
        fight();
    }

    @Override
    public void fight() {
        weaponBehavior = new Axe();
    }
}