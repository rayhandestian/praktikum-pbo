package utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class FileHandler {
    private static final String USER_FILE_PATH = "user_data.txt";

    public static void saveUserData(Map<String, String> userData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE_PATH))) {
            for (Map.Entry<String, String> entry : userData.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving user data: " + e.getMessage());
        }
    }

    public static Map<String, String> loadUserData() {
        Map<String, String> userData = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length >= 2) {
                    String username = parts[0];
                    String data = String.join(":", Arrays.copyOfRange(parts, 1, parts.length));
                    userData.put(username, data);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading user data: " + e.getMessage());
        }
        return userData;
    }
}