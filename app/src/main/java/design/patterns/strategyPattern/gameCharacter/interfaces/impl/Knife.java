package design.patterns.strategyPattern.gameCharacter.interfaces.impl;

import design.patterns.strategyPattern.gameCharacter.interfaces.WeaponBehavior;

public class Knife implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Knife: 칼로 베다.");
    }

}