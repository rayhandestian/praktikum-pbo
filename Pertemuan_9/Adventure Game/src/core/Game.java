package core;

import entities.*;
import entities.items.*;
import entities.enemies.*;
import utils.Randomizer;
import java.util.Scanner;

public class Game {
    private final AccountManager accountManager;
    private final Player player;
    private boolean isRunning;

    public Game() {
        this.accountManager = new AccountManager();
        this.player = new Player(); // Create a new player object when game starts
        this.isRunning = true;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            System.out.println("Main Menu:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    if (login(scanner)) {
                        gameMenu(scanner);
                    }
                    break;
                case 2:
                    register(scanner);
                    break;
                case 3:
                    System.out.println("Exiting game...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        scanner.close();
    }

    private boolean login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        return accountManager.login(username, password);
    }

    private void register(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        accountManager.register(username, password);
    }

    private void gameMenu(Scanner scanner) {
        while (isRunning) {
            System.out.println("Game Menu:");
            System.out.println("1. Venture");
            System.out.println("2. Check inventory");
            System.out.println("3. Back to main menu");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    venture(scanner);
                    break;
                case 2:
                    checkInventory();
                    break;
                case 3:
                    return; // return to main menu
            }
        }
    }

    private void venture(Scanner scanner) {
        boolean venturing = true;
        while (venturing) {
            if (!isRunning) {
                return;
            }
            System.out.println("Venture:");
            System.out.println("1. Go North");
            System.out.println("2. Go East");
            System.out.println("3. Go South");
            System.out.println("4. Go West");
            System.out.println("5. Stop Venture");

            System.out.print("Choose a direction or stop: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: case 2: case 3: case 4:
                    encounter(scanner);
                    break;
                case 5:
                    venturing = false;
                    break;
            }
        }
    }

    private void encounter(Scanner scanner) {
        if (Randomizer.chance(0.5)) {
            System.out.println("You've encountered an enemy!");
            Enemy enemy;
            if (Randomizer.chance(0.7)) {
                enemy = new Boar();
                combat(scanner, enemy);
            }
            else if (Randomizer.chance(0.5)) {
                enemy = new Goblin();
                combat(scanner, enemy);
            }
            else {
                enemy = new Dragon();
                combat(scanner, enemy);
            }
        } else if (Randomizer.chance(0.4)) {
            System.out.println("You've found an item!");
            Item item;
            if (Randomizer.chance(0.6)) {
                item = new RiceBall();
                player.getInventory().add(item);
                System.out.println("Added " + item.getName() + " to your inventory.");
            }
            else if (Randomizer.chance(0.3)) {
                item = new HealthPotion();
                player.getInventory().add(item);
                System.out.println("Added " + item.getName() + " to your inventory.");
            }
            else {
                item = new SacredFruit();
                player.getInventory().add(item);
                System.out.println("Added " + item.getName() + " to your inventory.");
            }
        } else {
            System.out.println("... Nothing interesting happened ~");
        }
    }

    private void combat(Scanner scanner, Enemy enemy) {
        while (enemy.isAlive() && player.isAlive()) {
            System.out.println("\n=-= Combat=-=");
            System.out.println("Enemy: " + enemy.getName() + ", HP: " + enemy.getHealth() + "/" + enemy.getMaxHealth() + ", Damage: " + enemy.getDamage());
            System.out.println("You: HP: " + player.getHealth() + "/" + player.getMaxHealth() + ", Damage: " + player.getAttack());
            System.out.println("1. Basic Attack (Deals " + player.getAttack() + " damage)");
            System.out.println("2. Ultimate Attack (Deals " + player.getAttack() * 2 + " damage & reduces damage taken by half)");
            System.out.println("3. Use Item (Opens inventory)");
            System.out.println("4. Run");

            System.out.print("Choose an action: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.println();

            switch (choice) {
                case 1:
                    enemy.takeDamage(player.getAttack());
                    if (enemy.isAlive()) {
                        player.takeDamage(enemy.getDamage());
                    }
                    break;
                case 2:
                    enemy.takeDamage(player.getAttack() * 2); // Ultimate attack does double damage
                    if (enemy.isAlive()) {
                        player.takeDamage(enemy.getDamage() / 2); // Ultimate attack reduces player damage taken by half
                    }
                    break;
                case 3:
                    checkInventory();
                    break;
                case 4:
                    System.out.println("\nYou ran away!\n");
                    return; // Exit combat
            }
        }

        if (!player.isAlive()) {
            System.out.println("\nYou have been defeated. Game over.");
            isRunning = false;
        } else {
            System.out.println("\n=-= Enemy defeated! =-=\n");
            player.addCoins(Randomizer.nextInt(5) + 2);
            player.increaseMaxHealth(enemy.getExperience());
            player.increaseAttack(enemy.getExperience() / 2);
        }
    }

    private void checkInventory() {
        Inventory inventory = player.getInventory();
        System.out.println("Coins: " + player.getCoins());
        System.out.println("Inventory: " + inventory.getItems().size() + " items.");
        for (Item item : inventory.getItems()) {
            System.out.println(item.getName() + ": " + item.getDescription());
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
