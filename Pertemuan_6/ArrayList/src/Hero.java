public class Hero {
    private String name;
    private double health;

    Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void setName(String name) {
        this.name = name;
    }

    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
    }

    public String toString() {
        return "Hero: " + this.name;
    }
}
