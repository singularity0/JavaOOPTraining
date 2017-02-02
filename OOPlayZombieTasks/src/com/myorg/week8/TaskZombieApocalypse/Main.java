package com.myorg.week8.TaskZombieApocalypse;

import java.io.Console;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
//        Console console = System.console();
//        String userInputFirstLine = console.readLine();

        String inputLine1 = "3 100";
        String inputLine2 = "Axe";
        int numberOfZombies = Integer.parseInt(inputLine1.split(" ")[0]);
        int zombiesHealth = Integer.parseInt(inputLine1.split(" ")[1]);

        Zombie[] zombies = new Zombie[numberOfZombies];

        for (int i = 0; i< numberOfZombies; i++){
            zombies[i] = new Zombie(zombiesHealth);
        }

        SmashingWeapons currentWeapon = new SmashingWeapons(WeaponType.AncientSword);
        int counterHits = 0;
        int totalNumberHits = 0;

        for (int i = 0; i < zombies.length; i++) {
            while (zombies[i].getCurrentHealth() > 0){
                zombies[i].hit(currentWeapon.getDamage());
                counterHits += 1;
            }
            totalNumberHits += counterHits;
            counterHits = 0;
        }


        System.out.println(totalNumberHits);
    }

    public void takeInoutFromUser(){

    }
}
