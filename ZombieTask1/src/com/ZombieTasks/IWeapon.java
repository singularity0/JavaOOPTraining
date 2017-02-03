package com.ZombieTasks;

public interface IWeapon {
    public int getDamage();
    public int getDurability();
    public String getType(); // can return "TO_SMASH" or "TO_SHOOT"
}