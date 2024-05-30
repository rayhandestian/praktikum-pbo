public class Manager extends Employee{
    String company;

    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name + " and I work at " + this.company + "!");
    }
}
