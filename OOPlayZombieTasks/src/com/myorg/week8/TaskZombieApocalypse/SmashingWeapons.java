package com.myorg.week8.TaskZombieApocalypse;

public class SmashingWeapons implements IWeapon {

    private int damage;
    private int durability;
    private int initialDurability;
    private WeaponType typeWeapon;


    public SmashingWeapons(WeaponType weaponType){
        this.typeWeapon = weaponType;

        switch (weaponType){
            case Axe: this.damage = 10; this.durability = 50; break;
            case AncientSword: this.damage = 50; this.durability = 10; break;
        }
        this.initialDurability = this.durability;
    }


    @Override
    public int getDamage() {
        int durabilityThreshold = initialDurability/2;
        this.durability -= 1;
        if (getDurability() < durabilityThreshold){
            if (this.damage > 1) {
                this.damage -= 1;
            }
        }
        return this.damage;
    }

    @Override
    public int getDurability() {

        return this.durability;
    }

    @Override
    public String getType() {
        return "TO_SMASH";
    }
}
