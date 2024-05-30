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
        this.player = new Player(null);
        this.isRunning = true;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            System.out.println("\n=-= Welcome to Infinite Dungeon =-=\nIn this dungeon, the rooms are constantly changing. You basically stuck here forever. Good luck!");
            System.out.println("Main Menu:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

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
            scanner.nextLine();

            switch (choice) {
                case 1:
                    venture(scanner);
                    break;
                case 2:
                    checkInventory();
                    break;
                case 3:
                    return;
            }
        }
    }

    private void venture(Scanner scanner) {
        boolean venturing = true;
        while (venturing) {
            if (!isRunning) {
                return;
            }
            System.out.println("\nRooms Ventured: " + player.getRegionVentured() + "\nVenture:");
            System.out.println("1. Go North");
            System.out.println("2. Go East");
            System.out.println("3. Go South");
            System.out.println("4. Go West");
            System.out.println("5. Stop Venture");

            System.out.print("Choose a direction or stop: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: case 2: case 3: case 4:
                    player.addRegionVentured();
                    encounter(scanner);
                    break;
                case 5:
                    venturing = false;
                    break;
            }
        }
    }

    private void encounter(Scanner scanner) {
        if (Randomizer.chance(0.4)) {
            System.out.println("You've encountered an enemy!");
            Enemy enemy;
            if (Randomizer.chance(0.7)) {
                enemy = new SmallSlime();
                combat(scanner, enemy);
            }
            else if (Randomizer.chance(0.5)) {
                enemy = new Goblin();
                combat(scanner, enemy);
            }
            else if (Randomizer.chance(0.3)) {
                enemy = new ComicallyLargeSlime();
                combat(scanner, enemy);
            }
            else if (Randomizer.chance(0.3)) {
                enemy = new Beholder();
                combat(scanner, enemy);
            }
            else {
                enemy = new FireDragon();
                combat(scanner, enemy);
            }
        } else if (Randomizer.chance(0.5)) {
            System.out.println("You've found an item!");
            Item item;
            if (Randomizer.chance(0.6)) {
                item = new RiceBall();
                player.getInventory().add(item);
                System.out.println("Added " + item.getName() + " to your inventory.");
            }
            else if (Randomizer.chance(0.4)) {
                item = new CommonHealthPotion();
                player.getInventory().add(item);
                System.out.println("Added " + item.getName() + " to your inventory.");
            }
            else if (Randomizer.chance(0.4)) {
                item = new DragonsHeart();
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
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    enemy.takeDamage(player.getAttack());
                    if (enemy.isAlive()) {
                        player.takeDamage(enemy.getDamage());
                    }
                    break;
                case 2:
                    // Actually, I have an idea dimana jika player melakukan ultimate attack,
                    // maka harus menyelesaikan matematika sederhana terlebih dahulu yang angkanya tentu saja random.
                    // for example, 5 + 12 = ? begitu. Kalau jawaban salah, maka ultimate attack gagal dan tetap terkena
                    // damage yang sama dari enemy (ga dibagi 2).
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
            player.increaseMaxHealth(enemy.getExperience());
            player.increaseAttack(enemy.getExperience() / 2);
        }
    }

    private void checkInt(int number, Scanner scanner) {
        if (number > 0 && number <= player.getInventory().getItems().size()) {
            Item item = player.getInventory().getItems().get(number - 1);
            System.out.println("Using item: " + item.getName());
            item.use(player);
        } else if (number < 0 && Math.abs(number) <= player.getInventory().getItems().size()) {
            Item item = player.getInventory().getItems().remove(Math.abs(number) - 1);
            System.out.println("Removed item: " + item.getName());
        } else if (number == 0) {
            return;
        } else {
            System.out.println("Invalid option, please try again.");
        }
    }

    private void checkInventory() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name: " + player.getUsername());
            System.out.println("Health: " + player.getHealth() + "/" + player.getMaxHealth());
            System.out.println("Attack: " + player.getAttack());
            System.out.println("Rooms Ventured: " + player.getRegionVentured());
            System.out.println("Inventory: " + player.getInventory().getItems().size() + " items.");
            for (int i = 0; i < player.getInventory().getItems().size(); i++) {
                Item item = player.getInventory().getItems().get(i);
                System.out.println((i + 1) + ": " + item.getName() + " - " + item.getDescription());
            }
            System.out.println("Enter 1-10 to use an item, -1 to -10 to drop an item, or 0 to return.");

            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) {
                return;
            } else {
                checkInt(choice, scanner);
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}