package design.patterns.strategyPattern.gameCharacter.interfaces.impl;

import design.patterns.strategyPattern.gameCharacter.interfaces.WeaponBehavior;

public class Axe implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Axe: 도끼로 찍다.");
    }
}
