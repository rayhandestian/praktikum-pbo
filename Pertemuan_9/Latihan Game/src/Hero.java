public class Hero {
    String name;
    int attackPower;
    int health;

    public Hero(String name, int attackPower, int health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }

    public void attack(Hero enemy) {
        System.out.println(this.name + " attacks " + enemy.name + ", power: " + this.attackPower);
        enemy.takeDamage(this.attackPower);
    }

    public void takeDamage(int damage) {
        System.out.println(this.name + " receives damage: " + damage);
        this.health = this.health - damage;
    }

    public void display() {
        System.out.println("Hero: " + this.name + "\n - Attack Power: " + this.attackPower + ",\n - Health: " + this.health);
    }
}
