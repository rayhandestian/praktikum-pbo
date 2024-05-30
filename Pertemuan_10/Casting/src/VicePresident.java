public class VicePresident extends Manager{

    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name + " and I work at " + this.company + " and I'm the Vice President!");
    }
}
