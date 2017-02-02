package com.myorg.week8.TaskZombieApocalypse;

/**
 * Created by misho on 02.02.17.
 */
public interface IWeapon {
    public int getDamage();
    public int getDurability();
    public String getType(); // can return "TO_SMASH" or "TO_SHOOT"
}