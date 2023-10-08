package Action;

import Another.Utils;
import Creatures.Monsters;
import Creatures.Player;

public class Blow {
    public static void blow(Player player, Monsters monsters, int whoAttacker){
        int N = getN(player, monsters, whoAttacker);
        boolean successOfDice = getDice(N);
        Utils.timer();
        if(successOfDice) {
            System.out.println("Success!");
            putNewParameters(player,monsters,whoAttacker,N);
        }else {
            System.out.println("Fail...");
        }
    }
    public static int getN(Player player, Monsters monsters, int whoAttacker){
        Utils.timer();
        if(whoAttacker == 1){
            System.out.println("\nThe player blows monsters!");
            if((player.getAttack() - monsters.getProtection() + 1) > 0) return player.getAttack() - monsters.getProtection() + 1;
        }else {
            System.out.println("\nThe monsters blow player!");
            if((monsters.getAttack() - player.getProtection() + 1) > 0) return monsters.getAttack() - player.getProtection() + 1;
        }
        return 1;
    }
    public static boolean getDice(int N){
        boolean success = false;
        int[] number = new int[N];
        for(int i = 0; i < N; i++){
            number[i] = (int) (Math.random() * 6)+1;
            if(number[i] == 5 || number[i] == 6) success = true;
        }
        return success;
    }
    public static void putNewParameters(Player player, Monsters monsters, int whoAttacker, int N){
        int damage;
        int newHealth;
        Utils.timer();
        if(whoAttacker == 1) {
            damage = player.getDamages()[player.getDamages().length-1];
            newHealth = monsters.getHealth() - damage;
            if(newHealth < 0) newHealth = 0;
            System.out.println(" The player's damage is: " + damage + "\n The health of monsters is " + newHealth);
            monsters.setHealth(newHealth);
        }
        else {
            damage = monsters.getDamages()[monsters.getDamages().length-1];
            newHealth = player.getHealth() - damage;
            if(newHealth < 0) newHealth = 0;
            System.out.println(" The damage of monsters is: " + damage + "\n The player's health is " + newHealth);
            player.setHealth(newHealth);
        }
    }
}
