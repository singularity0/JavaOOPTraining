package com.ZombieTasks;

public class ShootingWeapon implements IWeapon {

    private int damage;
    private int durability;
    private WeaponType typeWeapon;

    public ShootingWeapon(WeaponType weaponType){
        this.typeWeapon = weaponType;

        switch (weaponType){
            case Shotgun: this.damage = 25; this.durability = 10; break;
            case Revolver: this.damage = 15; this.durability = 6; break;
        }
    }

    @Override
    public int getDamage() {
        if (getDurability() > 1){
            this.durability -= 1;
        }
        return this.damage;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public String getType() {
        return "TO_SHOOT";
    }
}
