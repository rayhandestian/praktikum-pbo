public class Main {
    public static void main(String[] args) {
        Armor armor1 = new Armor("Iron Armor", 1, 20);
        Armor armor2 = new Armor("Steel Armor", 2, 30);
        Weapon weapon1 = new Weapon("Sword", 30);
        Weapon weapon2 = new Weapon("Axe", 0);

        Player player1 = new Player("Suisei");
        Player player2 = new Player("Watson");
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player1.display();
        player2.display();

        player2.attack(player1);
        player1.display();
        player2.display();

        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
