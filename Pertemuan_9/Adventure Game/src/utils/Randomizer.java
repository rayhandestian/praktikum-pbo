package utils;

import java.util.Random;

public class Randomizer {
    private static final Random random = new Random();

    public static boolean chance(double probability) {
        return random.nextDouble() < probability;
    }

    public static int nextInt(int bound) {
        return random.nextInt(bound);
    }
}
