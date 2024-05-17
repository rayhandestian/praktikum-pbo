package core;

import utils.FileHandler;
import java.util.Map;
import java.util.Scanner;

public class AccountManager {
    private Map<String, String> accounts;

    public AccountManager() {
        accounts = FileHandler.loadUserData();
    }

    public boolean register(String username, String password) {
        if (accounts.containsKey(username)) {
            System.out.println("Username already exists.");
            return false;
        }
        accounts.put(username, password);
        FileHandler.saveUserData(accounts);
        System.out.println("Registration successful.");
        return true;
    }

    public boolean login(String username, String password) {
        if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
            System.out.println("Login successful.");
            return true;
        }
        System.out.println("Login failed. Incorrect username or password.");
        return false;
    }

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: (1) Register (2) Login (3) Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String regUser = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String regPass = scanner.nextLine();
                    manager.register(regUser, regPass);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String loginUser = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPass = scanner.nextLine();
                    manager.login(loginUser, loginPass);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}
