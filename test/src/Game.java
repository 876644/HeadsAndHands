import Action.Blow;
import Another.Utils;
import Creatures.Monsters;
import Creatures.Player;

public class Game {
    public static void start(Player player, Monsters monsters){
        Utils.timer();
        System.out.println("\n---The game started.---");
        while (player.getHealth() != 0 && monsters.getHealth() != 0){
            int randomAttacker = (int) (Math.random() * 2);
            Blow.blow(player, monsters, randomAttacker);
        }
        writeWinner(player,monsters);
    }
    public static void writeWinner(Player player, Monsters monsters){
        Utils.timer();
        if(player.getHealth() == 0) System.out.println("\nThe monsters win.");
        else System.out.println("\nThe player wins.");
        Utils.timer();
        System.out.println("\n---Game over!---");
    }
}
