package com.ZombieTasks;

public class Game {
    private static int numberOfZombies;
    private static int zombiesHealth;
    private static String weapon;
    private static IWeapon currentWeapon;
    private static int totalNumberHits;

    public static void Run() {

        TakeInputFromUser();
        Zombie[] zombies = CreateZombies();
        CreateWeapon(weapon);
        GameLogicHitZombies(zombies);

        System.out.println(String
                .format("%1$s zombies with %2$s health each should be down with \n%3$d hits  ",
                numberOfZombies, zombiesHealth, totalNumberHits));
    }

    public static void TakeInputFromUser(){
        String inputLine1 = "3 100";  //hardcoded string for easier testing. System.console().readLine();
        weapon = "AncientSword";

        numberOfZombies = Integer.parseInt(inputLine1.split(" ")[0]);
        zombiesHealth = Integer.parseInt(inputLine1.split(" ")[1]);

    }

    public static Zombie[] CreateZombies(){
        Zombie[] zombies = new Zombie[numberOfZombies];

        for (int i = 0; i< numberOfZombies; i++){
            zombies[i] = new Zombie(zombiesHealth);
        }
        return zombies;
    }

    public static void CreateWeapon(String weapon){

        switch (weapon) {
            case "AncientSword":
                currentWeapon = new SmashingWeapons(WeaponType.AncientSword);
                break;
            case "Axe":
                currentWeapon = new SmashingWeapons(WeaponType.Axe);
                break;
            case "Revolver":
                currentWeapon = new ShootingWeapon(WeaponType.Revolver);
                break;
            case "Shotgun":
                currentWeapon = new ShootingWeapon(WeaponType.Shotgun);
                break;
            default:
                System.out.println(Utils.errorMessageWeaponInvalid);
        }
    }

    public static void GameLogicHitZombies(Zombie[] zombies){
        int counterHits = 0;
        totalNumberHits = 0;

        for (int i = 0; i < zombies.length; i++) {
            while (zombies[i].getCurrentHealth() > 0){
                zombies[i].hit(currentWeapon.getDamage());
                counterHits += 1;
            }
            totalNumberHits += counterHits;
            counterHits = 0;
        }
    }
}
