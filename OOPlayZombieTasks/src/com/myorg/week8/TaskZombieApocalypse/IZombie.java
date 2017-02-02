package com.myorg.week8.TaskZombieApocalypse;

/**
 * Created by misho on 02.02.17.
 */
public interface IZombie {
    public int getTotalHealth();
    public int getCurrentHealth();
    public void hit(int damage);
    public boolean isDead();
}
