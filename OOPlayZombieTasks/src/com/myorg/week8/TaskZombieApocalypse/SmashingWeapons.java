package com.myorg.week8.TaskZombieApocalypse;

public class SmashingWeapons implements IWeapon {

    private int damage;
    private int durability;
    private WeaponType typeWeapon;

    public SmashingWeapons(WeaponType weaponType){
        this.typeWeapon = weaponType;

        switch (weaponType){
            case Axe: this.damage = 10; this.durability = 50; break;
            case AncientSword: this.damage = 50; this.durability = 10; break;
            case Shotgun: this.damage = 25; this.durability = 10; break;
            case Revolver: this.damage = 15; this.durability = 6; break;
        }
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public String getType() {
        return this.typeWeapon.toString();
    }
}
