package com.ZombieTasks;

public interface IZombie {
    public int getTotalHealth();
    public int getCurrentHealth();
    public void hit(int damage);
    public boolean isDead();
}
