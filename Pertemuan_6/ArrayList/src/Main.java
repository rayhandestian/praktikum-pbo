import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hero heroOffense = new Hero("Gura", 100);
        Hero heroDefense = new Hero("Calli", 500);
        Hero heroAgility = new Hero("Mumei", 200);

        ArrayList<Hero> listHero = new ArrayList<Hero>();

        // Operasi 1: add
        System.out.println("Operasi 1: add");
        listHero.add(heroOffense);
        listHero.add(heroDefense);
        listHero.add(heroAgility);

        System.out.println(listHero);
        System.out.println();

        // Operasi 2: set
        System.out.println("Operasi 2: set");
        listHero.set(1, heroAgility);
        System.out.println(listHero);
        System.out.println();

        // Operasi 3: remove
        System.out.println("Operasi 3: remove");
        listHero.remove(1);
        System.out.println(listHero);
        System.out.println();

        // Operasi 4: access
        System.out.println("Operasi 4: access");
        System.out.println(listHero);
        Hero heroAmbil = listHero.get(0);
        heroAmbil.setName("Gawr");
        System.out.println(listHero);
        heroAmbil.display();
        System.out.println();

        // Method pada ArrayList
        System.out.println("Method 2");
        System.out.println("1. size()\t:" + listHero.size());
        System.out.println("2. isEmpty()\t:" + listHero.isEmpty());
        System.out.println("3. contains()\t:" + listHero.contains(heroOffense));
        System.out.println(" contains()\t:" + listHero.contains(heroDefense));
        System.out.println("4. indexOf()\t:" + listHero.indexOf(heroOffense));
        System.out.println(" indexOf()\t:" + listHero.indexOf(heroDefense));

        for(Hero list: listHero){
            System.out.println(list);
        }

    }
}