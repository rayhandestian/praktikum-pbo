public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Asuna", 100, 100);
        HeroStrength hero2 = new HeroStrength("Alice", 25, 200);

        System.out.println("=-= Hero Status =-=");
        hero1.display();
        hero2.display();

        System.out.println("\n=-= Combat =-=");
        hero1.attack(hero2);
        hero2.attack(hero1);

        System.out.println("\n=-= Hero Status =-=");
        hero1.display();
        hero2.display();
    }
}