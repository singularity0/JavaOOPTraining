package com.myorg.week8.TaskZombieApocalypse;

public abstract class Weapon implements IWeapon {

    @Override
    public abstract int getDamage();

    @Override
    public abstract int getDurability();

    @Override
    public abstract String getType();
}
