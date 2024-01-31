package design.patterns.strategyPattern.gameCharacter;

import design.patterns.strategyPattern.gameCharacter.Character;
import design.patterns.strategyPattern.gameCharacter.interfaces.impl.BowAndArrow;

public class King extends Character {

    public King() {
        System.out.println(">>>>> King <<<<<");
        fight();
    }

    @Override
    public void fight() {
        weaponBehavior = new BowAndArrow();
    }

}