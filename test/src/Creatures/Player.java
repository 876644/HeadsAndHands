package Creatures;

import Another.Parameters;

import java.util.Scanner;

public class Player {
    private int attack;
    private int protection;
    private int health;
    private int[] damages;
    private int healing;
    private static int maxHealth;
    public Player(int attack, int protection, int health, int[] damages) {
        this.attack = attack;
        this.protection = protection;
        this.health = health;
        this.damages = damages;
    }
    public int getAttack() {
        return attack;
    }
    public int getProtection() {
        return protection;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        if(health <= 0){
            System.out.println("The player died.");
            this.health = 0;
        } else{
            if(healing < 4) {
                healing++;
                this.health = (int) (health + maxHealth * 0.3);
                System.out.println("The player healed.");
            }
            else this.health = health;
        }
    }
    public int[] getDamages() {
        return damages;
    }
    public static Player getPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write parameters for player.");
        int newAttack = Parameters.writeAttackOrProtection("attack");
        int newProtection = Parameters.writeAttackOrProtection("protection");
        int newHealth = Parameters.writeHealth();
        int[] newDamages = Parameters.writeDamages();
        System.out.println("\nThe player:" + "\n Attack: " + newAttack + "\n Protection: " + newProtection + "\n Health: " + newHealth + "\n Damages: " + newDamages[0] + " - " + newDamages[newDamages.length-1]);
        return new Player(newAttack, newProtection, newHealth, newDamages);
    }

}


