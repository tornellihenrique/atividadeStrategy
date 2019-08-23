package entities;

public abstract class Character {

    private WeaponBehavior weaponBehaviour;

    public void fight() {
        weaponBehaviour.useWeapon();
    }
}
