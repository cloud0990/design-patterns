package design.patterns.strategyPattern.gameCharacter.interfaces.impl;

import design.patterns.strategyPattern.gameCharacter.interfaces.WeaponBehavior;

public class Sword implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Sword: 검을 휘두르다.");
    }
}