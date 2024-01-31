package design.patterns.strategyPattern.gameCharacter.interfaces.impl;

import design.patterns.strategyPattern.gameCharacter.interfaces.WeaponBehavior;

public class BowAndArrow implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("BowAndArrow: 활을 쏘다.");
    }
}