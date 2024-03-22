public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Player1", 100, 1);
        Player player2 = new Player("Player2", 100, 1);

        Weapon sword = new Weapon("Sword", 10);
        Armor plateArmor = new Armor("Plate Armor", 5);

        Weapon axe = new Weapon("Axe", 15);
        Armor leatherArmor = new Armor("Leather Armor", 3);

        player1.equipWeapon(sword);
        player1.equipArmor(plateArmor);

        player2.equipWeapon(axe);
        player2.equipArmor(leatherArmor);

        // Round 1
        player1.attack(player2);
        player2.display();

        // Round 2
        player2.attack(player1);
        player1.display();

        // Round 3
        player1.attack(player2);
        player2.display();
    }
}
