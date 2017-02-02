package com.myorg.week8.TaskZombieApocalypse;

public class Zombie implements IZombie{
    private int health;
    private int totalHealth;  //Initial would have been a better name
    private int numberOfHitsRecevied;
    private boolean isDead;

    public Zombie(int health){
        this.health = health;
        this.numberOfHitsRecevied = 0;
        this.isDead = false;
        this.totalHealth = health;
    }
    @Override
    public int getTotalHealth() {
        return 0;
    }

    @Override
    public int getCurrentHealth() {
        return this.health;
    }

    @Override
    public void hit(int damage) {
        this.health -= damage;
        if(this.health == 0){
            this.isDead = true;
        }
    }

    @Override
    public boolean isDead() {
        return this.isDead;
    }
}
