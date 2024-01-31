package design.patterns.strategyPattern.gameCharacter;

import design.patterns.strategyPattern.gameCharacter.interfaces.WeaponBehavior;

public abstract class Character {

    public Character() {
    }

    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void performFight() {
        this.weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }

}