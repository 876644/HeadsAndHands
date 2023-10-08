import Creatures.*;


public class Main {
    public static void main(String[] args) {
        Player player1 = Player.getPlayer();
        Monsters monsters1 = Monsters.getMonsters();
        Game.start(player1,monsters1);
    }
}