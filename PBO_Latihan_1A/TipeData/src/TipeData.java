public class TipeData {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // byte iniByte = 100;
        // short iniShort = 1000;
        // int iniInt = 1000000;
        // long iniLong = 1000000;
        // long iniLong2 = 1000000L;

        // float iniFloat = 10.12F;
        // double iniDouble = 12.2424;

        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        // Konversi tipe data
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;

        System.out.println(iniShort2);

        // Character
        char e = 'E';
        char k = 'K';
        System.out.print(e);
        System.out.println(k);

        // Boolean
        boolean benar = true;
        boolean salah = false;
        System.out.println(benar);
        System.out.println(salah);

        // String
        String firstName = "Rayhan Surya";
        String lastName = "Destian";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Variable
        String longName;
        longName = "Rayhaaaaaaaaaan";
        System.out.println(longName);

        // Var (tipe data otomatis)
        var fmttm = "Fly me to the moon";
        System.out.println(fmttm);

        // Final (const)
        final var age = 99;
        System.out.println(age);

        // Tipe data non-primitif, biasanya diawali dengan huruf besar, misal String
        Integer ageObject = age;
        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();

        System.out.print(ageObject);
        System.out.print(shortAge);
        System.out.println(byteAge);

        // Array
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Rayhan";
        arrayString[1] = "Surya";
        arrayString[2] = "Destian";

        // Array Initializer
        int[] arrayInt = new int[] {
            10, 90, 80, 67, 29
        };

        long[] arrayLong = {
            10, 90, 80, 67, 29
        };

        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        // Array dalam array (multidimensi)
        String[][] members = {
            {"Rayhan", "Surya", "Destian"},
            {"Yan", "Stephen"},
            {"Arshanda", "Geulis"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0] + members[2][1]);
    }
}
